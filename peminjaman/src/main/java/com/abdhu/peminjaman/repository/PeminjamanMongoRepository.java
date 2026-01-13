package com.abdhu.peminjaman.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.abdhu.peminjaman.cqrs.query.model.PeminjamanDocument;
public interface PeminjamanMongoRepository extends MongoRepository<PeminjamanDocument, String> {}