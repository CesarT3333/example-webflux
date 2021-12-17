package com.getnet.example.withoutflux.withoutwebflux.controller;

import com.getnet.example.webflux.commons.models.BinDto;
import com.getnet.example.webflux.commons.models.BinDtoFactory;
import com.getnet.example.withoutflux.withoutwebflux.repository.BinRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
@RequestMapping("/v1/bins")
public class BinController {
    private final BinRepository binRepository;

    @GetMapping
    public List<BinDto> getAllBins() {
        return binRepository.findAll()
                .stream()
                .map(BinDtoFactory::ofBin)
                .collect(Collectors.toList());
    }

    @GetMapping("/parallel")
    public List<BinDto> getAllBinsParallel() {
        return binRepository.findAll()
                .parallelStream()
                .map(BinDtoFactory::ofBin)
                .collect(Collectors.toList());

    }

}
