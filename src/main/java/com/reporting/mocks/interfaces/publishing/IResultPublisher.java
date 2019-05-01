package com.reporting.mocks.interfaces.publishing;

import com.reporting.mocks.model.*;
import com.reporting.mocks.model.risks.Risk;

public interface IResultPublisher {
    void publish(CalculationContext calculationContext);
    void publish(MarketEnv marketEnv);
    void publishIntradayRiskResultSet(RiskResultSet riskResultSet);
    void publishIntradayRiskResult(RiskResult<? extends Risk> riskResult);
    void publishIntradayTrade(TradeLifecycle tradeLifecycle);
    void publishEndofDayRiskRun(RiskResultSet riskResultSet);
}
