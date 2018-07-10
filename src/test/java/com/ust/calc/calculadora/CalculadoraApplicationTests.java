package com.ust.calc.calculadora;

import static org.mockito.Mockito.doReturn;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.ust.calc.calculadora.controllers.CalculadoraController;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class CalculadoraApplicationTests {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private CalculadoraController calculadoraNomina;
	
	private double nominaResult;
	
	@Before
	public void setup() {
		doReturn(nominaResult).when(calculadoraNomina).doCalculos(Mockito.any(Integer.class), Mockito.any(Integer.class));
	}
	
	
	@Test
	public void contextLoads() throws Exception {
		
//		mockMvc
//		.perform(get("/resta/8/3"))
//		.andExpect(status().isOk());
	}
	
	@Test
	public void devolverResultadoMultiplicacion() throws Exception {
		mockMvc.perform(get("/calculo?one=5&two=8")).andExpect(content().string("40"));
	}
	

}
