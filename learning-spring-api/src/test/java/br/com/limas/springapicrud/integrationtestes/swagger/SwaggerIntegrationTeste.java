package br.com.limas.springapicrud.integrationtestes.swagger;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.limas.springapicrud.configs.TestConfigs;
import br.com.limas.springapicrud.integrationtestes.testcontainers.AbstractIntegrationTest;

import static io.restassured.RestAssured.given;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class SwaggerIntegrationTeste extends AbstractIntegrationTest {

	@Test
	void showDisplaySwaggerUiPage() {

		var content = given().basePath("/swagger-ui/index.html")
				.port(TestConfigs.SERVER_PORT)
				.when()
				.get()
				.then()
				.statusCode(200)
				.extract()
				.body()
				.asString();

		assertTrue(content.contains("Swagger UI"));

	}

}
