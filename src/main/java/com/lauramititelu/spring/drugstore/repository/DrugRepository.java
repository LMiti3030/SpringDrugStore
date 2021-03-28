package com.lauramititelu.spring.drugstore.repository;

import com.lauramititelu.spring.drugstore.model.Drug;

import java.util.List;

public interface DrugRepository {
    public List<Drug> findAll();
}
