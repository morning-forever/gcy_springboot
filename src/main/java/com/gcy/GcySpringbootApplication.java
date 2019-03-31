package com.gcy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.WebApplicationInitializer;

@SpringBootApplication

public class GcySpringbootApplication  extends SpringBootServletInitializer implements WebApplicationInitializer {

	public static void main(String[] args) {
		SpringApplication.run(GcySpringbootApplication.class, args);
	}

/*	@Override
protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	return builder.sources(GcySpringbootApplication.class);
}*/



	/*@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Let's inspect th23e beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}

		};
	}*/


	/*@SpringBootApplication
	public class Application extends SpringBootServletInitializer implements WebApplicationInitializer {



	}*/

}
