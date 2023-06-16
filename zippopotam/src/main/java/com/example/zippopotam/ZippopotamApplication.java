package com.example.zippopotam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ZippopotamApplication {

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(ZippopotamApplication.class, args);
		RestTemplate restTemplate = new RestTemplate();
		String apiUrl = "https://api.zippopotam.us/us/33162";
		ResponseEntity<String> response = restTemplate.getForEntity(apiUrl, String.class);
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode jsonNode = objectMapper.readTree(response.getBody());
		System.out.println("New Random Joke is"+"\n" + jsonNode.toPrettyString());

	}

}
