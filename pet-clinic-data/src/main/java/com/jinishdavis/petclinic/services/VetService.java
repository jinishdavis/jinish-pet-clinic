package com.jinishdavis.petclinic.services;

import com.jinishdavis.petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long Id);

    Vet save(Vet owner);

    Set<Vet> findAll();
}
