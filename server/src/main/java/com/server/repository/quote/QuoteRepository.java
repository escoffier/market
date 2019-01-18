package com.server.repository.quote;

import com.model.Quote;
import org.springframework.data.repository.CrudRepository;

public interface QuoteRepository extends CrudRepository<Quote, String> {
}
