package com.reporting.mocks.interfaces.persistence;

import com.reporting.mocks.model.CalculationContext;
import com.reporting.mocks.model.PricingGroup;
import com.reporting.mocks.model.id.CalculationContextId;

import java.util.Collection;
import java.util.UUID;

public interface ICalculationContextStore {
    CalculationContext create();

    CalculationContext createCopy(CalculationContext calculationContextToCopy);

    CalculationContext setCurrentContext(CalculationContext calculationContext);
    CalculationContext getCurrentContext();
    CalculationContext getCalculationContextById(CalculationContextId calculationContextId);
    CalculationContext getPreviousContext();

    CalculationContext get(UUID id);

    PricingGroup getPricingGroup();

    Collection<CalculationContext> getAll();
}
