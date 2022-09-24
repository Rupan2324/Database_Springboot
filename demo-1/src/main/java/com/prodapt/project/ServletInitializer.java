package com.prodapt.project;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;



public class ServletInitializer extends SpringBootServletInitializer {

	   @Override
	   	   protected SpringApplicationBuilder configure(SpringApplicationBuilder application1) {
	       return application1.sources(Demo1Application.class);
	   }

}