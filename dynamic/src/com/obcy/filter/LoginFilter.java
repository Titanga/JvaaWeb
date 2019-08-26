package com.obcy.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @auther obcy
 * @date 2019/8/25 0025 - 19:11
 */
@WebFilter(value = {"/uuuuuuuuuu"})
public class LoginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest)req;
        HttpServletResponse response = (HttpServletResponse)resp;
        String requestURI = request.getRequestURI();
        System.out.println(requestURI);

            Object user = request.getSession().getAttribute("user");
            if (user != null) {
                chain.doFilter(req,resp);
            }else{
                request.getRequestDispatcher("login.jsp").forward(request,response);
            }



    }

    public void init(FilterConfig config) throws ServletException {

    }

}
