package com.getnet.example.webflux.commons.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Builder
public class BinDto {
    private String id;
    private Long binCode;
    private BinConfiguration binConfiguration;
    private String brandId;
    private String description;
    private Long encryptedPositiveIdRuleTableIndex;
    private Long maximumPANSize;
    private Long minimumPANSize;
    private Long openPositiveIdRuleTableIndex;
}
