package com.getnet.with.webflux.controller;

import com.getnet.example.webflux.commons.models.BinDto;
import com.getnet.example.webflux.commons.models.BinDtoFactory;
import com.getnet.with.webflux.repository.BinRepositoryWebFlux;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.ParallelFlux;

@RestController
@AllArgsConstructor
@RequestMapping("/v1/bins")
public class BinController {

    private final BinRepositoryWebFlux binRepositoryWebFlux;

    @GetMapping
    public ParallelFlux<ResponseEntity<BinDto>> getAllBinsWebFlux() {
        return binRepositoryWebFlux
                .findAll()
                .parallel()
                .map(BinDtoFactory::ofBin)
                .map(ResponseEntity::ok);
    }

}
