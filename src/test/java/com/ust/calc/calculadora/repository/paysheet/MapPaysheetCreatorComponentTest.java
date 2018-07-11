package com.ust.calc.calculadora.repository.paysheet;

import com.ust.calc.calculadora.api.resources.Paysheet;
import com.ust.calc.calculadora.repository.CreatorComponent;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Map;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class MapPaysheetCreatorComponentTest {

    CreatorComponent<Paysheet, String> paysheetCreatorComponent;

    private @Mock
    Map<String, Paysheet> map;

    private @Mock
    Random random;

    @Before
    public void setUp() throws Exception {
        paysheetCreatorComponent = new MapPaysheetCreatorComponent(map, random);
    }

    @Test
    public void save() {
        final Paysheet paysheet = paysheetCreatorComponent.save(Paysheet.builder().build());
        assertThat(paysheet).isNotNull();

    }
}