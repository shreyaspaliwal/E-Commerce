package com.sheryians.major;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MajorApplication {
	
	//private static Logger log = LoggerFactory.getLogger(MajorApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MajorApplication.class, args);
	}
	
	/*@Value("${spring.security.oauth2.client.registration.google.client-id}")
	private String clientId;
	
	@Value("${spring.security.oauth2.client.registration.google.client-secret}")
	private String clientSecret;

	@Override
	public void run(String... args) throws Exception {
		log.info("message");
	}*/

}
