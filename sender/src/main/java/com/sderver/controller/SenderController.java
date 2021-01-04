package com.sderver.controller;

import com.sderver.service.SenderService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class SenderController {

    SenderService countService;

    @GetMapping("/count")
    public Mono<Integer> getCount() {
        return countService.callHighLoadService();
    }
}
