package com.ust.calc.calculadora;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class CalculadoraApplicationTests {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void contextLoads() throws Exception {
		
		mockMvc.perform(get("/calculo?one=5&two=8&three=1&four=1")).andExpect(status().isOk());
	}
	
	@Test
	public void devolverResultadoMultiplicacion() throws Exception {
		mockMvc.perform(get("/calculo?one=5&two=8&three=1&four=1")).andExpect(content().string("40"));
	}
	

}
