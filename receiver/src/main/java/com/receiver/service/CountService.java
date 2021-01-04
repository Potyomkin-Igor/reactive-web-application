package com.receiver.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.concurrent.TimeUnit;

@Slf4j
@Service
public class CountService {

    public Mono<Integer> count() {

        Integer result = 0;

        for (int i = 0; i < 1000; i++) {
            result++;
        }

        try {
            TimeUnit.SECONDS.sleep(1);

        } catch (InterruptedException ex) {
            log.error("Thread was interrupted. Reason: {}", ex.getMessage());
        }

        return Mono.just(result);
    }
}
