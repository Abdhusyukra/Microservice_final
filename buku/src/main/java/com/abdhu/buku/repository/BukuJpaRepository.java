package com.abdhu.buku.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abdhu.buku.cqrs.command.model.Buku;

@Repository
public interface BukuJpaRepository extends JpaRepository<Buku, Long> { }