package com.ust.calc.calculadora.clients;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class CalculadoraRestaClientTest {

//	@Autowired
	private CalculadoraSumaClient restClient;
//	@Before
	public void setUp() throws Exception {
	}

//	@Test
	public void happyTest() {
		Integer resultado = restClient.suma(5,2);
		assertThat(resultado).isEqualTo(7);
	}
	
//	@Test
	public void unhappyTest() {
		Integer resultado = restClient.suma(8,2);
		assertThat(resultado).isNotEqualTo(7);
	}
	
	

}
