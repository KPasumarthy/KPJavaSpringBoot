package com.kpjavaspringboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@AutoConfiguration
@SpringBootApplication
public class KPJavaSpringBootApplication {


	public static void main(String[] args) {
		SpringApplication.run(KPJavaSpringBootApplication.class, args);
		System.out.println("KP : KPJavaSpringBootApplication : main() ");
	}

}

//@SpringBootApplication
//public class KPJavaSpringBootApplication extends SpringBootServletInitializer {
//
//	@Value("${app.title}") // Injecting the value of app.greeting from application.properties
//	private static String greeting;
//
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(KPJavaSpringBootApplication.class);
//	}
//
//	public static void main(String[] args) {
//		SpringApplication.run(KPJavaSpringBootApplication.class, args);
//		System.out.println("KP : KPJavaSpringBootApplication : main() : " +  greeting);
//	}
//}