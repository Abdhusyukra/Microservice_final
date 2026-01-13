package com.abdhu.anggota.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.abdhu.anggota.cqrs.query.model.AnggotaDocument;

public interface AnggotaMongoRepository extends MongoRepository<AnggotaDocument, String> { }