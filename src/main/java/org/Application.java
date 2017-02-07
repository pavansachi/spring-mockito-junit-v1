package org;

import org.spring.config.JavaConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		System.out.println(ctx.getBean("personService"));
		
	}

}
