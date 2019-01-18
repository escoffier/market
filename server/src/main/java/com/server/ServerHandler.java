package com.server;

import com.model.TradeRequest;
import com.model.TradeResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ServerHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(ServerHandler.class);

    public TradeResponse handleMessage(TradeRequest tradeRequest) {
        LOGGER.info("receive Trade Request " + tradeRequest.toString());
        return new TradeResponse();
    }
}
