package com.ust.calc.calculadora.clients;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

@Deprecated
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class CalculadoraDivisionClientTest {

	@Mock
	private CalculadoraDivisionClient restClient;
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void happyTest() {
		Mockito.when(restClient.division(9.0,3.0)).thenReturn(3.0);
		double resultado = restClient.division(9.0,3.0);
		assertThat(resultado).isEqualTo(3.0);
	}
	
	@Test
	public void unhappyTest() {
		Mockito.when(restClient.division(8.0,2.0)).thenReturn(4.0);
		double resultado = restClient.division(8.0,2.0);
		assertThat(resultado).isNotEqualTo(8.0);
	}
	
	

}
