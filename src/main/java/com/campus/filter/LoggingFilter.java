package com.campus.filter;

import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;

@WebFilter("/*")
public class LoggingFilter extends HttpFilter{
    @Override
    public void doFilter(ServiceRequest request , ServletResponse response, FilterChain chain) throws IOException, ServletException{
        System.out.println("Request received");
        chain.doFilter(request, response);
        System.out.println(:Response sent);

    }
}