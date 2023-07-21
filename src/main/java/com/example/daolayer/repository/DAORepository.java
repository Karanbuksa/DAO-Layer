package com.example.daolayer.repository;

import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class DAORepository {
    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    private String pathToScript = "ProductNames.sql";

    public DAORepository(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    public List<String> getProductName(String customerName) {
        MapSqlParameterSource parametersMap = new MapSqlParameterSource();
        parametersMap.addValue("name", customerName);
        String script = read(pathToScript);
        return namedParameterJdbcTemplate.queryForList(
                script, parametersMap, String.class
        );
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
