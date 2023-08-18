package com.example.compelk.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index"); // "index" refers to index.html
        registry.addViewController("/search").setViewName("search"); // "index" refers to index.html
        registry.addViewController("/search-results").setViewName("search-results"); // "index" refers to index.html

    }
}
