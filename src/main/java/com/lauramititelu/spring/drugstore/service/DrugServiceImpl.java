package com.lauramititelu.spring.drugstore.service;

import com.lauramititelu.spring.drugstore.model.Drug;
import com.lauramititelu.spring.drugstore.repository.DrugRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrugServiceImpl implements DrugService {

    @Autowired
    private DrugRepositoryImpl repository;

//    public DrugServiceImpl(DrugRepositoryImpl drugRepositoryImpl){
//        repository=drugRepositoryImpl;
//        System.out.println("inside constructor");
//    }

    @Override
    public void printAll(){
        List<Drug> drugs = repository.findAll();
        for(Drug d: drugs)
            System.out.println(d);
    }

    @Override
    public List<Drug> findAll(){
        return repository.findAll();
    }

    public double mediumPrice(){
        double medPrice= 0.0;
        List<Drug> drugs = repository.findAll();
        double inst = drugs.size();
        for(Drug d: drugs)
            medPrice+=d.getPrice();
        return medPrice/inst;
    }


}
