package com.ust.calc.calculadora.repository.paysheet;

import com.ust.calc.calculadora.api.resources.Paysheet;
import com.ust.calc.calculadora.repository.CreatorComponent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Random;

@Component
@RequiredArgsConstructor
public class MapPaysheetCreatorComponent implements CreatorComponent<Paysheet, String> {

    private final Map<String, Paysheet> map;
    private final Random random;

    @Override
    public <S extends Paysheet> S save(S paysheet) {
        final String id = String.valueOf(Math.abs(random.nextInt()));
        final Paysheet paysheetSaved = Paysheet.builder().id(id).employeeId(paysheet.getEmployeeId()).salary(paysheet.getSalary()).build();
        map.put(id, paysheetSaved);
        return (S) paysheetSaved;
    }

}
