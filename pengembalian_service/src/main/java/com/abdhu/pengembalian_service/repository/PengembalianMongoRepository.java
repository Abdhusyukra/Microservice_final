package com.abdhu.pengembalian_service.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.abdhu.pengembalian_service.cqrs.query.model.PengembalianDocument;
public interface PengembalianMongoRepository extends MongoRepository<PengembalianDocument, String> {}