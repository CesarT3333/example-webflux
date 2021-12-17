package com.getnet.with.webflux.repository;

import com.getnet.example.webflux.commons.models.Bin;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BinRepositoryWebFlux extends ReactiveMongoRepository<Bin, String> {
}
