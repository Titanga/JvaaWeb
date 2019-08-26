package com.obcy.servlet;

import com.alibaba.fastjson.JSON;
import com.obcy.bean.Users;
import com.obcy.service.userserviceimpl.UserServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * @auther obcy
 * @date 2019/8/24 0024 - 12:15
 */
@WebServlet("/user")
public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserServiceimpl service = new UserServiceimpl();
        //System.out.println(request.getContextPath());
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String action = request.getParameter("action");
        PrintWriter wr = response.getWriter();
        //判断action是什么行为
        if("login".equals(action)){
            login(request, response, service);
            return;
        }else if ("allUser".equals(action)) {
            System.out.println(111);
            List<Users> list = service.findAllUser();
            wr.write(JSON.toJSONString(list));
            System.out.println(list);
        }



    }




    //登录调用
    private void login(HttpServletRequest request, HttpServletResponse response, UserServiceimpl service)  {
        Users u = new Users();
        u.setUname(request.getParameter("uname"));
        u.setPassword(request.getParameter("password"));
        Users users = service.FindUser(u);
        if (users == null) {
            System.out.println("登录失败");
        }else {
            try {
                request.setAttribute("user",u);
                response.sendRedirect("list.jsp");
            } catch (IOException e) {
                try {
                    response.getWriter().write("服务器繁忙，请稍后再试");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }

        }
    }
}
