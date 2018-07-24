package com.ust.calc.calculadora;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ust.calc.calculadora.api.resources.Employee;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;

//@RunWith(SpringRunner.class)
@SpringBootTest(classes = CalculadoraApplication.class)
@AutoConfigureMockMvc
@ActiveProfiles("INTEGRATION_TEST")
@ContextConfiguration
@Slf4j
public class CalculadoraApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void contextLoads() throws Exception {
        log.info("hol");
    }

    @Autowired
    ObjectMapper o;

    @Test
    public void contextLoads(String algo) throws Exception {
        log.info("hol");
        Employee em = o.readValue(algo, Employee.class);
        assertThat(em.getName()).isNotNull();

    }

}
