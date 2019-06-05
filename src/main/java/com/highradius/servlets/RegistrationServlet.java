package com.highradius.servlets;

import com.highradius.data_loader_handlers.DataUploader;
import com.highradius.models.User;


import java.io.IOException;
import java.io.PrintWriter;


public class RegistrationServlet extends javax.servlet.http.HttpServlet {

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
            getResponseforRequset(request, response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
            getResponseforRequset(request, response);
    }

    private void getResponseforRequset(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response){

        DataUploader dataUploader =  new DataUploader();
        PrintWriter writer=null;

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String pas = request.getParameter("password");
        String sex = request.getParameter("gender");
        String add = request.getParameter("address");

        char c = 'M';
        if(sex.equals("Female"))
            c = 'F';

        User u = new User(name,email,pas,c,add);

        String htmlSuccessTemplate = "<div class=\"container alert alert-success\">" +
                "<center>" +
                "<h1>Registration Successfull.</h1>" +
                "<h5> Click to </h5><h4><a href =\"login.jsp\">login</a></h4>" +
                " </center>" +
                "</div>";

        String htmlFailTemplate = "<div class=\"container alert alert-danger\">" +
                "<center>" +
                "<h1>Registration Failed.</h1>" +
                "<h5> Click to </h5><h4><a href =\"registration.jsp\">register again.</a></h4>" +
                " </center>" +
                "</div>";

        try {
            writer = response.getWriter();
            if(dataUploader.uploadUser(u)!=null)
                writer.print(htmlSuccessTemplate);
            else
                writer.print(htmlFailTemplate);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
