package com.server.repository.stockinfo;

import com.server.model.StockInfo;
import org.springframework.data.repository.CrudRepository;

public interface StockInfoRepository  extends CrudRepository<StockInfo, Integer> {
}
