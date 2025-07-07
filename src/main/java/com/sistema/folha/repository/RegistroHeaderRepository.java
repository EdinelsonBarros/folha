package com.sistema.folha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistema.folha.tabelaDomain.RegistroHeader;

@Repository
public interface RegistroHeaderRepository extends JpaRepository<RegistroHeader, String> {

}
