package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		try (ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
				"beans.xml")) {
			MessageRenderer mr = classPathXmlApplicationContext.getBean("renderer",
					MessageRendererImplementation.class);
			mr.render();
		} catch (Exception e) {
			System.err.println("Bir Hata Meydana Geldi! Hata:" + e);
		}
	}
}
