package com.reporting.mocks.interfaces.persistence;

import com.reporting.mocks.model.DataMarkerType;
import com.reporting.mocks.model.MarketEnv;
import com.reporting.mocks.model.PricingGroup;

import java.util.Collection;
import java.util.UUID;

public interface IMarketStore {
    MarketEnv create(DataMarkerType type);

    MarketEnv create(DataMarkerType type, int dayAdvance);

    MarketEnv get(UUID id);

    UUID getStoreId();

    PricingGroup getPricingGroup();

    Collection<MarketEnv> getAll();
}
