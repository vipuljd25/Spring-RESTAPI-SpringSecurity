package com.pat.project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter{
	
	 @Bean
	    @Description("Thymeleaf template resolver serving HTML 5")
	    public ClassLoaderTemplateResolver templateResolver() {
	        
	        ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
	        
	        templateResolver.setPrefix("/webapp/dist/");
	        templateResolver.setCacheable(false);
	        templateResolver.setSuffix(".html");        
	        templateResolver.setTemplateMode("HTML5");
	        templateResolver.setCharacterEncoding("UTF-8");
	        
	        return templateResolver;
	    }

	    @Bean
	    @Description("Thymeleaf template engine with Spring integration")
	    public SpringTemplateEngine templateEngine() {
	        
	        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
	        templateEngine.setTemplateResolver(templateResolver());
	        return templateEngine;
	    }

	    @Bean
	    @Description("Thymeleaf view resolver")
	    public ViewResolver viewResolver() {

	        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
	        
	        viewResolver.setTemplateEngine(templateEngine());
	        viewResolver.setCharacterEncoding("UTF-8");

	        return viewResolver;
	    }    
	    @Override
	    public void addResourceHandlers(ResourceHandlerRegistry registry) {
	        registry
	                .addResourceHandler("/assets/global/**")
	                .addResourceLocations("/assets/global/");
	    }
	    public void configure(WebSecurity web) throws Exception {
	        web
	                .ignoring()
	                .antMatchers("/assets/global/**");
	    }

}
