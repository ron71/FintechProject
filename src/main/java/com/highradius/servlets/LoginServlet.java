package com.highradius.servlets;

import com.highradius.authentication_handlers.AuthenticationManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "login", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getResponseforRequset(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getResponseforRequset(request, response);
    }

    public void getResponseforRequset(HttpServletRequest request, HttpServletResponse response){

        AuthenticationManager authenticationManager = new AuthenticationManager();
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        PrintWriter printWriter = null;

        try {
            printWriter=response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String name = authenticationManager.authenticateUser(email, password);
        if(name!=null){
            //LOGIN SUCCESSFUL
            HttpSession session = request.getSession();
            session.setAttribute("name", name);
            try {
                response.sendRedirect("index.jsp");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            printWriter.print("<H1>LOGIN FAILED");
        }
    }


}
