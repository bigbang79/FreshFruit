package com.fruit.common.cros;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CROSFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse response1= (HttpServletResponse) response;
        HttpServletRequest request1=(HttpServletRequest)request;
        //response1.setHeader("Access-Control-Allow-Origin","*");
        response1.setHeader("Access-Control-Allow-Origin",request1.getHeader("Origin"));
        response1.setHeader("Access-Control-Allow-Methods","GET,PUT,POST,DELETE");
        response1.setHeader("Access-Control-Max-Age","2000");
        response1.setHeader("Access-Control-Allow-Headers","Origin,X-Requested-with,Content-Type,Accept");
        response1.setHeader("Access-Control-Allow-Credentials","true");
        chain.doFilter(request,response1);
    }

    @Override
    public void destroy() {

    }
}
