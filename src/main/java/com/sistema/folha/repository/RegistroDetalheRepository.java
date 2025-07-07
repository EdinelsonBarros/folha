package com.sistema.folha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistema.folha.tabelaDomain.RegistroDetalhe;

@Repository
public interface RegistroDetalheRepository extends JpaRepository<RegistroDetalhe, String> {

}
