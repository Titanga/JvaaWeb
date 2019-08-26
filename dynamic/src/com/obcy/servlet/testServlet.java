package com.obcy.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @auther obcy
 * @date 2019/8/25 0025 - 20:08
 */
@WebServlet(value = {"/test"})
public class testServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(request.getPathInfo()+"---pathinfo");
        System.out.println(request.getContextPath()+"---contextpath");
        System.out.println(request.getRequestURL()+"---URL");
        System.out.println(request.getRequestURI()+"---URI");
        System.out.println(request.getMethod()+"---method");
        System.out.println(request.getServletPath()+"---servletpath");
        System.out.println(request.getQueryString()+"query");

    }
}
