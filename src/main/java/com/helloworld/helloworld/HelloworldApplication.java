package com.helloworld.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.SpringVersion;


@SpringBootApplication
public class HelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
		System.out.println("hello world!");
		System.out.println("Spring version: " + SpringVersion.getVersion());

		Person p = new Person();
		p.setFirstName("Alice");
		p.setLastName("doe");
		p.setGender("Male");
		System.out.println(p.getName());
		System.out.println(p.getGender());

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Person p2=(Person) context.getBean("Person");
		p2.setFirstName("Helin");
		p2.setLastName("Doe");
		p2.setGender("Female");
		System.out.println(p2.getName());
		System.out.println(p2.getGender());
		
		//context.registerShutdownHook();

		Address a = new Address();
		a.setState("California");
		a.setCity("Mountain View");
		System.out.println(a.toString());

		Address a2=(Address) context.getBean("address");
		System.out.println("Injecting the address\n");
		p2.setAddress(a);
		System.out.println(p2.getAddress() + "\n");
		context.close();





	}

}


