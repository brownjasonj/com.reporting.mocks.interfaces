package com.reporting.mocks.interfaces.publishing;

public interface IResultPublisherConfiguration {
    String getIntradayRiskSetTopic();
    String getIntradayRiskTickTopic();
    String getCalculationContextTopic();
    String getIntradayTradeTopic();
    String getMarketEnvTopic();
}
