package com.reporting.mocks.interfaces.publishing;

public interface IResultPublisherConfiguration {
    String getIntradayRiskSetTopic();
    String getIntradayRiskTickTopic();
    String getCalculationContextTopic();
    String getIntradayTradeTopic();
    String getMarketEnvTopic();
    String getCalculationContextDataSetName();
    String getMarketEnvDataSetName();
    String getRiskResultDataSetName();
    String getRiskResultSetDataSetName();
    String getTradePopulationDataSetName();
    String getTradeDataSetName();
}
