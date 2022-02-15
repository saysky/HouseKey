package com.liuyanzhao.housekey.config;

import com.liuyanzhao.housekey.interceptor.UserInfoInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author 言曌
 * @date 2021/12/29 11:38 下午
 */

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    /**
     * 配置静态资源路径
     *
     * @param registry registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/upload/**")
                .addResourceLocations("file:///" + System.getProperties().getProperty("user.home") + "/sens/upload/");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册TestInterceptor拦截器
        InterceptorRegistration registration = registry.addInterceptor(new UserInfoInterceptor());
        registration.addPathPatterns("/admin");
        registration.addPathPatterns("/admin/**");
        registration.excludePathPatterns("/admin/login");
        registration.excludePathPatterns("/admin/logout");
    }
}
