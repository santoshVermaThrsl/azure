package com.thrsl.azure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class AzureApplication {

	@GetMapping("/message")
	public String data(){
		return "This is my first application on azure !";
	}
	@GetMapping("/")
	public String data1(){
		return "This is my first application on azure1 !";
	}
	@GetMapping("/test")
	public String data2(){
		return "This is my first application on azure2 !";
	}

	public static void main(String[] args) {
		SpringApplication.run(AzureApplication.class, args);
	}

}
