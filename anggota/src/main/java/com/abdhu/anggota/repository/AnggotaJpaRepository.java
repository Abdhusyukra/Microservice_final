package com.abdhu.anggota.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.abdhu.anggota.cqrs.command.model.Anggota;

public interface AnggotaJpaRepository extends JpaRepository<Anggota, Long> { }