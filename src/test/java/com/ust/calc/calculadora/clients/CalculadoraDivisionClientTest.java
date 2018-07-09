package com.ust.calc.calculadora.clients;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class CalculadoraDivisionClientTest {

	@Autowired
	private CalculadoraDivisionClient restClient;
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void happyTest() {
		double resultado = restClient.divide(6.0,2.0);
		assertThat(resultado).isEqualTo(3.0);
	}
	
	@Test
	public void unhappyTest() {
		double resultado = restClient.divide(8.0,2.0);
		assertThat(resultado).isNotEqualTo(8.0);
	}
	
	

}
