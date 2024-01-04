/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.edu.tecazuay.ec.projectbucketcloud;

import com.google.cloud.storage.Acl;
import com.google.cloud.storage.Blob;
import com.google.cloud.storage.BlobInfo;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author Usuario
 */
@SuppressWarnings("serial")
@MultipartConfig()
@WebServlet(name = "Upload", urlPatterns = {"/Upload"})
public class UploadServlet extends HttpServlet {

    private static final String BUCKET_NAME = "my_bucket_sg2024"; //System.getenv("BUCKET_NAME");
    private static Storage storage = null;

    @Override
    public void init() {
        storage = StorageOptions.getDefaultInstance().getService();
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
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
        final Part filePart = request.getPart("file");
        final String fileName = filePart.getSubmittedFileName();

        // Verificar si BUCKET_NAME es nulo
        if (BUCKET_NAME == null) {
            response.getWriter().print("Error: BUCKET_NAME no está configurado.");
            return;
        }

        List<Acl> acls = new ArrayList<>();
        acls.add(Acl.of(Acl.User.ofAllUsers(), Acl.Role.READER));

        Blob blob = storage.create(
                BlobInfo.newBuilder(BUCKET_NAME, fileName).setAcl(acls).build(),
                filePart.getInputStream());

        response.getWriter().print(blob.getMediaLink());
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
