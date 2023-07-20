package com.example.daolayer.controller;

import com.example.daolayer.repository.DAORepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DAOController {
    private final DAORepository daoRepository;

    public DAOController(DAORepository daoRepository) {
        this.daoRepository = daoRepository;
    }

    @GetMapping("/products/fetch-product")
    public @ResponseBody String productName(@RequestParam("name") String name) {
        return daoRepository.getProductName(name);
    }
}
