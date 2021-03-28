package com.lauramititelu.spring.drugstore.service;

import com.lauramititelu.spring.drugstore.model.Drug;

import java.util.List;

public interface DrugService {
    void printAll();
    List<Drug> findAll();
    double mediumPrice();
}
