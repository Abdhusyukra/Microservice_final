package com.abdhu.pengembalian_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abdhu.pengembalian_service.cqrs.command.model.Pengembalian;

public interface PengembalianJpaRepository extends JpaRepository<Pengembalian, Long> {
}
