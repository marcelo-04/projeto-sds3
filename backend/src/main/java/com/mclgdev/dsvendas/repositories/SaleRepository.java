package com.mclgdev.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mclgdev.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
