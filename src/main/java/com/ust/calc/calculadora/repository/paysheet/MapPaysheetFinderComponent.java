package com.ust.calc.calculadora.repository.paysheet;

import com.ust.calc.calculadora.api.resources.Paysheet;
import com.ust.calc.calculadora.repository.FinderComponent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class MapPaysheetFinderComponent implements FinderComponent<Paysheet, String> {

    private final Map<String, Paysheet> map;

    @Override
    public Optional<Paysheet> findById(final String id) {
        return Optional.ofNullable(map.get(id));
    }

}
