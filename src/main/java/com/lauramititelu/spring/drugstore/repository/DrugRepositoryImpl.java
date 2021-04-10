package com.lauramititelu.spring.drugstore.repository;

import com.lauramititelu.spring.drugstore.model.Drug;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DrugRepositoryImpl implements DrugRepository {

    private static List<Drug> drugs;

    public DrugRepositoryImpl(){
        populateList();
    }

    private static List<Drug> populateList(){
        drugs = new ArrayList<>();
        drugs.add(new Drug("Aspirina", 3.5, "3508"));
        drugs.add(new Drug("Nurofen", 17.3, "3982"));
        drugs.add(new Drug("Vigantoletten", 10.3, "3988"));
        //drugs.add(new Drug());
        return drugs;
    }

    @Override
    public List<Drug> findAll(){
        return drugs;
    }

}
