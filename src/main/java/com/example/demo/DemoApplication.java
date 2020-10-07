package com.example.demo;

import com.example.demo.model.kakao.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.web.client.RestTemplate;
import java.net.URI;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class DemoApplication {

	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);
	private static final String HOST = "https://kauth.kakao.com";
	private static final String REDIRECT_URI = "127.0.0.1:8080/kakaoapi";

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

//	@Bean
//	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
//		return args -> {
//			//Request request =
//
//		};
//
//	}

	@Bean
	public String test(RestTemplate restTemplate){
		ParameterizedTypeReference<HashMap<String, String>> responseType =
				new ParameterizedTypeReference<HashMap<String, String>>() {};

		var uri = java.net.URI.create(HOST + "/oauth/authorize?client_id=003a6244023a167e54b15bf4656055a5&redirect_uri=" + REDIRECT_URI + "&response_type=code");

		RequestEntity<Void> request = RequestEntity.get(uri).accept(MediaType.APPLICATION_JSON).build();
		var jsonDictionary = restTemplate.exchange(request, responseType);
		jsonDictionary = jsonDictionary;

		return "";

	}

}
