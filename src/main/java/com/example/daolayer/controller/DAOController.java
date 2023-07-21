package com.example.daolayer.controller;

import com.example.daolayer.repository.DAORepository;
import com.example.daolayer.service.DAOService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DAOController {
    private final DAOService service;

    public DAOController(DAOService service) {
        this.service = service;
    }

    @GetMapping("/products/fetch-product")
    public @ResponseBody String productName(@RequestParam("name") String name) {
        return service.getProductName(name);
    }
}
