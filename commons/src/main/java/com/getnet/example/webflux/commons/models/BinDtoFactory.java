package com.getnet.example.webflux.commons.models;

public class BinDtoFactory {

    public static BinDto ofBin(Bin bin) {
        return BinDto.builder()
                .id(bin.getId())
                .binCode(bin.getBinCode())
                .binConfiguration(bin.getBinConfiguration())
                .brandId(bin.getBrandId())
                .maximumPANSize(bin.getMaximumPANSize())
                .description(bin.getDescription())
                .minimumPANSize(bin.getMinimumPANSize())
                .build();
    }
}
