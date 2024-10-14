package com.example.BankingApp.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.BankingApp.model.BankService;
import com.example.BankingApp.repository.ServiceRepository;

@Controller
public class ServiceController {

    @Autowired
    private ServiceRepository serviceRepository;
    
    @GetMapping("/services")
    public String getServices(Model model){
    	List<BankService>services=serviceRepository.findAll();
    	model.addAttribute("bankName","ABC Bank");
    	model.addAttribute("services",services);
    	model.addAttribute("bankService", new BankService());
    	
		return "services";
    	
    }
    
    @PostMapping("/services/add")
    public String addService(@ModelAttribute BankService bankService){
    	serviceRepository.save(bankService);
    	return "redirect:/services";
    	
    }

   
   
	
	
	
	
	
	
	
}