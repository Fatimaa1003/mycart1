
package com.mycompany.mycart.servlets;

import com.mycompany.mycart.dao.CategoryDao;
import com.mycompany.mycart.dao.ProductDao;
import com.mycompany.mycart.entities.Category;
import com.mycompany.mycart.entities.Product;
import com.mycompany.mycart.helper.FactoryProvider;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

@MultipartConfig
@WebServlet(name = "ProductOperationServlet", urlPatterns = {"/ProductOperationServlet"})
public class ProductOperationServlet extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            //servlet
            //add category
            //add product
            String op = request.getParameter("operation");
           if(op.trim().equals("addcategory"))
           {
               //fetching category data
            String title = request.getParameter("catTitle");
            String description = request.getParameter("catDescription");
            
                Category category = new Category();
                category.setCategoryTitle(title);
                category.setCategoryDescription(description);
                
                //category database save
                CategoryDao categoryDao = new CategoryDao(FactoryProvider.getFactory());
              long catId=(long)  categoryDao.saveCategory(category);
                
               // out.println("category saved");
                HttpSession httpSession = request.getSession();
                
                httpSession.setAttribute("massege", "category added succefully:"+catId);
                response.sendRedirect("admin.jsp");
                return;
           }
           else if(op.trim().equals("addproduct"))
           {
                //add product
                //work
               //System.out.println("hey");
                String pTitle = request.getParameter("pTitle");
                String pDesc = request.getParameter("pDesc");
              //  int pPrice=Integer.parseInt(request.getParameter("pPrice"));
               // int pDiscount=Integer.parseInt(request.getParameter(" pDiscount"));
                // int pQuality =Integer.parseInt (request.getParameter("pQuality"));
                // long catId =Long.parseLong (request.getParameter("catId"));
              String title=(request.getParameter("pPrice"));
                int pPrice=Integer.parseInt(title.trim());
                String dis=(request.getParameter("pDiscount"));
                int pDiscount=Integer.parseInt(dis.trim());
                String qua=(request.getParameter("pQuality"));
                int pQuality=Integer.parseInt(qua.trim());
                
                String id=(request.getParameter("catId"));
                long catId=Long.parseLong(id.trim());
                
                 Part part=request.getPart("pPic");
                 
                // out.println("pTitle" +pTitle);
                Product p = new Product();
                p.setpTitle(pTitle);
                p.setpDesc(pDesc);
               
                p.setpPrice(pPrice);
                 p.setpDiscount(pDiscount);
                p.setpQuality(pQuality);
               
                p.setpPhoto(part.getSubmittedFileName());
                
               // out.println("Category Title: " + pTitle);

                
                //get category by id
                CategoryDao cdoa=new CategoryDao(FactoryProvider.getFactory());
                Category category = cdoa.getCategoryById(catId);
               // out.println("Category Title: " + pTitle);
                 p.setCategory(category);
                 //product save
                 
                 ProductDao pdao=new ProductDao(FactoryProvider.getFactory());
                
                // pdao.saveProduct(p);
                  pdao.saveProduct(p);
                //pic upload
                //find out the path to upload photo
              String   path = request.getRealPath("img")+ File.separator +"products"+File.separator;
             //System.out.println(path);
             //uploading code
             try{
                 String fileName=part.getSubmittedFileName();
                 String filePath=path+File.separator+fileName;
             FileOutputStream fos=new FileOutputStream(filePath);
             
             InputStream is=part.getInputStream();
             
             //read data
             
             byte[]data=new byte[is.available()];
            is.read(data);
             //writing data
             fos.write(data);
           fos.close();
             }catch(Exception e)
            {
                e.printStackTrace();
             }
             
                
               //  out.println("product save success");
                   HttpSession httpSession = request.getSession();
                
                httpSession.setAttribute("massege", "category added succefully:");
                response.sendRedirect("admin.jsp");               
                return;
                
           }
           
          
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
