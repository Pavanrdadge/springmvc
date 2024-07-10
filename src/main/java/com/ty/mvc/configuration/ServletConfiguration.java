package com.ty.mvc.configuration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration.Dynamic;

public class ServletConfiguration implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {

		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(AppConfiguration.class);

		DispatcherServlet dispatcherServlet = new DispatcherServlet(context);

		Dynamic dynamic = servletContext.addServlet("dispatcher", dispatcherServlet);
		dynamic.addMapping("/");
		dynamic.setLoadOnStartup(1);

		System.out.println("Application configuration done");
	}

}
