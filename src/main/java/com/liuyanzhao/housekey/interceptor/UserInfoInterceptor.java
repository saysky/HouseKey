package com.liuyanzhao.housekey.interceptor;

import com.liuyanzhao.housekey.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 言曌
 * @date 2021/12/29 11:36 下午
 */
@Service
public class UserInfoInterceptor implements HandlerInterceptor {



    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws IOException {
        User user = (User) request.getSession().getAttribute("user");
        // 如果用户未登录，拦截
        if (user == null) {
            response.sendRedirect("/admin/login");
            return false;
        }
        return true;
    }

}
