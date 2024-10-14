package com.example.BankingApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BankingApp.model.Branch;

public interface BranchRepository extends JpaRepository<Branch,Long>{
    List<Branch>findByCity(String city);
}
