package com.abdhu.buku.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.abdhu.buku.cqrs.query.model.BukuDocument;

@Repository
public interface BukuMongoRepository extends MongoRepository<BukuDocument, String> { }