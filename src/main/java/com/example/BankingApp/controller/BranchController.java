package com.example.BankingApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import com.example.BankingApp.model.Branch;
import com.example.BankingApp.repository.BranchRepository;




@Controller
public class BranchController {

	
	@Autowired
	private BranchRepository branchRepository;


    @GetMapping("/branches")
    public String getBranches(Model model) {
    
  	 List<Branch>branches=branchRepository.findByCity("Bangalore");
    	model.addAttribute("branchName", "ABC Bank");
    	model.addAttribute("branches",branches);
		return "branches";

    	
    }

    
}
