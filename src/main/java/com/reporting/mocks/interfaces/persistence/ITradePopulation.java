package com.reporting.mocks.interfaces.persistence;

import com.reporting.mocks.model.DataMarkerType;
import com.reporting.mocks.model.id.TradePopulationId;
import com.reporting.mocks.model.trade.Tcn;
import com.reporting.mocks.model.trade.Trade;
import com.reporting.mocks.model.trade.TradeType;
import reactor.core.publisher.Flux;
import java.util.*;

public interface ITradePopulation {
    TradePopulationId getId();
    String getPricingGroupName();
    DataMarkerType getType();
    Date getAsOf();

    Collection<Trade> getTrades();
    List<Trade> getByTradeType(TradeType tradeType);
    List<TradeType> getTradeTypes();
    int getTradeCount();
    Trade getTrade(Tcn tcn);
}
