package com.ford.demo.companyclient.controller;

import com.ford.demo.companyclient.dto.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CompanyController {
    @Autowired
    CompanyClient companyClient;
    @GetMapping("/id/{id}")
    Company getCompanyById(@PathVariable("id") Integer id){
        return companyClient.getCompanyById(id);
    }
}
