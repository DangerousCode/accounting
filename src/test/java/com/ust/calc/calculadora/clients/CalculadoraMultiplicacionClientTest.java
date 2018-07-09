package com.ust.calc.calculadora.clients;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class CalculadoraMultiplicacionClientTest {

	@Mock
	private CalculadoraMultiplicacionClient restClient;
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void happyTest() {
		Integer resultado = restClient.multiply(5,2);
		assertThat(resultado).isEqualTo(0);
	}
	
	@Test
	public void unhappyTest() {
		Integer resultado = restClient.multiply(8,2);
		assertThat(resultado).isNotEqualTo(10);
	}
	
	

}
