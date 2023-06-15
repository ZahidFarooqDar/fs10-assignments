package com.example.chucknorris;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ChucknorrisApplication {

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(ChucknorrisApplication.class, args);

		RestTemplate restTemplate = new RestTemplate();
		String apiUrl = "https://api.chucknorris.io/jokes/random";
		ChuckNorrisJoke joke = restTemplate.getForObject(apiUrl, ChuckNorrisJoke.class);
		System.out.println("New Random Joke is\n" + joke);
	}

	public static class ChuckNorrisJoke {
		private String id;
		private String value;

		@JsonProperty("created_at")
		private String createdAt;

		@JsonProperty("updated_at")
		private String updatedAt;

		@JsonProperty("icon_url")
		private String iconUrl;

		private String url;

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getCreatedAt() {
			return createdAt;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getUpdatedAt() {
			return updatedAt;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

		public String getIconUrl() {
			return iconUrl;
		}

		public void setIconUrl(String iconUrl) {
			this.iconUrl = iconUrl;
		}

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		@Override
		public String toString() {
			return "ChuckNorrisJoke{" +
					"id='" + id + '\'' +
					", value='" + value + '\'' +
					", createdAt='" + createdAt + '\'' +
					", updatedAt='" + updatedAt + '\'' +
					", iconUrl='" + iconUrl + '\'' +
					", url='" + url + '\'' +
					'}';
		}
	}
}
