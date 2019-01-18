package com.client;

import com.model.TradeRequest;

public interface StockServiceGateway {
    void send(TradeRequest request);
}
