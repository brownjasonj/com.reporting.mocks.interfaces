package com.reporting.mocks.interfaces.persistence;

import com.reporting.mocks.model.DataMarkerType;
import com.reporting.mocks.model.id.TradePopulationId;
import com.reporting.mocks.model.trade.Tcn;
import com.reporting.mocks.model.trade.Trade;
import com.reporting.mocks.model.trade.TradeType;
import reactor.core.publisher.Flux;

import java.util.Collection;
import java.util.Date;
import java.util.List;

public interface ITradePopulationReactive {
    TradePopulationId getId();
    String getPricingGroupName();
    DataMarkerType getType();
    Date getAsOf();
    int getTradeCount();
    int getTradeCountByTradeType(TradeType tradeType);

    Flux<Trade> getTrades();
    Flux<Trade> getTradesByType(TradeType tradeType);
    List<TradeType> getTradeTypes();
    Trade getTrade(Tcn tcn);
}
