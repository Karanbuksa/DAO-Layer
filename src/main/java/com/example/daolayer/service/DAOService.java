package com.example.daolayer.service;

import com.example.daolayer.repository.DAORepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DAOService {
    private final DAORepository repository;

    public DAOService(DAORepository repository) {
        this.repository = repository;
    }

    public String getProductName(String name) {
        List<String> list;
        if ((list = repository.getProductName(name)).isEmpty()) {
            list.add("Ничего не найдено");
        }
        return String.join("\n", list);
    }
}
