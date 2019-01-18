package com.server;

import com.model.Quote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;

//@Component
public class QuoteOperation {

    @Autowired
    @Qualifier("redisTemplate")
    RedisTemplate<String, Quote> redisTemplate;

    public void writeHash(String key, Quote quote) {
        redisTemplate.opsForHash().put(Quote.OBJECT_KEY, key, quote);

    }

    public Quote getHash(String key) {
        return (Quote) redisTemplate.opsForHash().get(Quote.OBJECT_KEY, key);

    }
}
