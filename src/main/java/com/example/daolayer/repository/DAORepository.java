package com.example.daolayer.repository;

import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class DAORepository {
    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    private String pathToScript = "ProductNames.sql";

    public DAORepository(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    public String getProductName(String customerName) {
        Map<String, Object> parametersMap = new HashMap<>();
        parametersMap.put("name", customerName);
        String script = read(pathToScript);
        List<String> productNames = namedParameterJdbcTemplate.query(
                script, parametersMap,
                (rs, rowNum) -> rs.getString("product_name")
        );
        return productNames.stream()
                .findFirst()
                .orElse("Ничего не найдено");

    }

    private static String read(String scriptFileName) {
        try (InputStream is = new ClassPathResource(scriptFileName).getInputStream();
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            return bufferedReader.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void changeScriptPath(String path) {
        pathToScript = path;
    }
}
