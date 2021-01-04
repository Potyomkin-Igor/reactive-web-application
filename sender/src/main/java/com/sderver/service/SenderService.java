package com.sderver.service;

import com.sderver.config.PropertiesConfig;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Slf4j
@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class SenderService {

    WebClient.Builder webClientBuilder;
    PropertiesConfig.ReceiverConfig receiverConfig;

    public Mono<Integer> callHighLoadService() {
        log.info("Calling high-loaded service");

        return webClientBuilder
                .build()
                .get()
                .uri(String.format("http://%s:%s/count", receiverConfig.getName(), receiverConfig.getPort()))
                .retrieve()
                .bodyToMono(Integer.class);
    }
}
