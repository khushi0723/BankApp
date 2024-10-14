package com.example.BankingApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BankingApp.model.BankService;

public interface ServiceRepository extends JpaRepository<BankService,Long>{
}
