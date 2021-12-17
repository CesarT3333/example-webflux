package com.getnet.example.webflux.commons.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "bins")
public class Bin {
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
