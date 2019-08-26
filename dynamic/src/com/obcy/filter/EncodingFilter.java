package com.obcy.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @auther obcy
 * @date 2019/8/24 0024 - 22:59
 */
@WebFilter("/uuuuu")
public class EncodingFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        System.out.println("放行前");
        resp.setContentType("text/html;charset=utf-8");
        chain.doFilter(req, resp);


        System.out.println("放行后");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
