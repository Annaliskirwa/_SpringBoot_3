package com.example.International.PhoneNumbers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class InternationalPhoneNumbersApplication {
	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(InternationalPhoneNumbersApplication.class, args);
	}

	@Value("${server.instance.id}")
	String instanceId;

	@GetMapping("/hello")
	public String hello(){
		return String.format("Hello from instance %s", instanceId);
	}

}
