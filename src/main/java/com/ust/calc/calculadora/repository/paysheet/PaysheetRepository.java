package com.ust.calc.calculadora.repository.paysheet;

import com.ust.calc.calculadora.api.resources.Paysheet;
import com.ust.calc.calculadora.repository.CreatorComponent;
import com.ust.calc.calculadora.repository.CrudRepository;
import com.ust.calc.calculadora.repository.FinderComponent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class PaysheetRepository implements CrudRepository<Paysheet, String> {

    private final CreatorComponent<Paysheet, String> creatorComponent;
    private final FinderComponent<Paysheet, String> finderComponent;

    @Override
    public Optional<Paysheet> findById(String id) {
        return finderComponent.findById(id);
    }

    @Override
    public <S extends Paysheet> S save(S entity) {
        return creatorComponent.save(entity);
    }
}
