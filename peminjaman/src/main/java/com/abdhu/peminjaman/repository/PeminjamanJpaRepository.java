package com.abdhu.peminjaman.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.abdhu.peminjaman.cqrs.command.model.Peminjaman;
public interface PeminjamanJpaRepository extends JpaRepository<Peminjaman, Long> {}