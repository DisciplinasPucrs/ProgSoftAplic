package softaplic.demosecurity3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.resttestclient.TestRestTemplate;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
class Demosecurity3ApplicationTests {

	@Autowired
	TestRestTemplate restTemplate;

	@Test
	void contextLoads() {
	}

	@Test
	void shouldReturnOkWithAnonymousAccess() {
		ResponseEntity<String> response = restTemplate.getForEntity("/public/health", String.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals("Hello controller", response.getBody());
	}

	@Test
	void shouldReturnUnauthorizedWhenNoCrendentialsSent() {
		ResponseEntity<String> response = restTemplate.getForEntity("/api/hello", String.class);
        assertEquals(HttpStatus.UNAUTHORIZED, response.getStatusCode());
	}

	@Test
	void shouldReturnUnauthorizedWithBadCredentials() {
		ResponseEntity<String> response = restTemplate
			.withBasicAuth("teste", "senha")
			.getForEntity("/api/hello", String.class);
        assertEquals(HttpStatus.UNAUTHORIZED, response.getStatusCode());
	}

	@Test
	void shouldReturnOkWithGoodCredentials() {
		ResponseEntity<String> response = restTemplate
			.withBasicAuth("user", "user123")
			.getForEntity("/api/hello", String.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals("Hello, user", response.getBody());
	}
}
