package com.reporting.mocks.interfaces.persistence;

import com.reporting.mocks.model.trade.Tcn;
import com.reporting.mocks.model.trade.Trade;

public interface ITradePopulationLive extends ITradePopulation {
    Trade add(Trade trade);
    Trade oneAtRandom();
    Trade delete(Tcn tcn);
}
