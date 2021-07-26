package com.imooc.miaosha.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.web.http.CookieSerializer;
import org.springframework.session.web.http.DefaultCookieSerializer;

@Configuration
public class SpringSessionConfig {
    public SpringSessionConfig(){}

    public CookieSerializer httpSessionIdResolver(){
        DefaultCookieSerializer cookieSerializer = new DefaultCookieSerializer();
        cookieSerializer.setSameSite(null);
        return cookieSerializer;
    }
}
