package com.example.daolayer.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DAORepository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<String> getProductName(String customerName) {
        String script = "SELECT o.productName FROM orders o " +
                "WHERE o.customer.id IN (SELECT c.id FROM customers c WHERE LOWER(c.name) = LOWER(:customerName))";

        return entityManager.createQuery(script, String.class)
                .setParameter("customerName", customerName)
                .getResultList();

    }


}
