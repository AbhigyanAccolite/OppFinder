package com.oppfinder.oppfinder;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class OppfinderApplicationTests {

	public RestTemplate template = new RestTemplate();

	@Test
	void contextLoads() {
	}
}
