package com.getnet.example.withoutflux.withoutwebflux.repository;

import com.getnet.example.webflux.commons.models.Bin;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BinRepository extends MongoRepository<Bin, String> {
}
