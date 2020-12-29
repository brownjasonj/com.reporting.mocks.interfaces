package com.reporting.mocks.interfaces.persistence;

import com.reporting.mocks.model.DataMarkerType;
import com.reporting.mocks.model.PricingGroup;
import com.reporting.mocks.model.id.TradePopulationId;

import java.util.Collection;
import java.util.List;

public interface ITradeStore {
    PricingGroup getPricingGroup();

    ITradePopulation createSnapShot(DataMarkerType type);

    ITradePopulation getTradePopulationById(TradePopulationId id);

    ITradePopulationLive getTradePopulationLive();

    Collection<ITradePopulation> getAllTradePopulation();

    List<TradePopulationId> getTradePopulationsIds();

    ITradePopulationReactive createReactiveSnapShot(DataMarkerType type);
    ITradePopulationReactive getTradePopulationReactiveById(TradePopulationId id);
}
