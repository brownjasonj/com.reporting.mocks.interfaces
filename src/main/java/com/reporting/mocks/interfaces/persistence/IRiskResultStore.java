package com.reporting.mocks.interfaces.persistence;

import com.reporting.mocks.model.RiskResult;
import com.reporting.mocks.model.id.RiskRunId;
import com.reporting.mocks.model.id.TradePopulationId;
import com.reporting.mocks.model.risks.Risk;

import java.util.List;

public interface IRiskResultStore {
    List<RiskResult<? extends Risk>> getAll();
    List<RiskResult<? extends Risk>> getAllByRiskRunId(RiskRunId riskRunId);
    RiskResult<? extends Risk> add(RiskResult<? extends Risk> riskResultSet);
}
