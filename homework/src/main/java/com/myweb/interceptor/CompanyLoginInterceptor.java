package com.myweb.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CompanyLoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //是否登录过的判断
        if(request.getSession().getAttribute("currCom") == null){
            if(request.getSession().getAttribute("currAdmin")!=null){
                return true;
            }
            response.sendRedirect(request.getContextPath()+"/main/loginOrRegist");
            return false;
        }
        return true;//放行请求
    }
}
