package com.github.benmanes.caffeine.cache.mytest;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;

import java.util.concurrent.TimeUnit;

public class TestCaffeine {
    public static void main(String[] args) {
        Cache<Object, Object> cache = Caffeine.newBuilder()
                .maximumSize(1000)
                .expireAfterWrite(10, TimeUnit.SECONDS)
                .build();
        cache.put("foo", "bar");
    }
}
