package org.example.reggie.filter;

import com.alibaba.fastjson.JSON;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.example.reggie.common.BaseContext;
import org.example.reggie.common.R;
import org.springframework.util.AntPathMatcher;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 检查用户是否已经登录成功
 * @author zfl
 * @create 2023-02-09 20:25
 */
@WebFilter("/*")
@Slf4j
public class LoginCheckFilter implements Filter {
    //路径匹配器，支持通配符
    public static final AntPathMatcher PATH_MATCHER = new AntPathMatcher();
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        //        定义不需要处理的请求路径
        String[] urls=new String[]{
                "/employee/login",
                "/employee/logout",
                "/backend/**",
                "/front/**",
                "/user/sendMsg",
                "/user/login"
        };
        //        1、获取本次请求的URI
        String requestURI = request.getRequestURI();
        log.info("拦截到请求：{}",request.getRequestURI());

        //2、判断本次请求是否需要处理
        boolean check = check(requestURI, urls);
        //3、如果不需要处理，则直接放行
        if(check){
            log.info("可以放行");
            filterChain.doFilter(request,response);
            return;
        }
        //4-1判断登录状态，如果已登录，则直接放行
        if(request.getSession().getAttribute("employee") != null){
            Long id = (Long) request.getSession().getAttribute("employee");
            BaseContext.setCurrentId(id);
            filterChain.doFilter(request,response);
            return;
        }
        //4-2判断登录状态，如果已登录，则直接放行
        if(request.getSession().getAttribute("user") != null){
            Long id = (Long) request.getSession().getAttribute("user");
            BaseContext.setCurrentId(id);
            filterChain.doFilter(request,response);
            return;
        }
        //5、如果未登录则返回未登录结果
        response.getWriter().write(JSON.toJSONString(R.error("NOTLOGIN")));
        return;
    }
    public boolean check(String url,String[] urls){
        for (String s : urls) {
            if(PATH_MATCHER.match(s,url)){
                return true;
            }
        }
        return false;
    }
}
