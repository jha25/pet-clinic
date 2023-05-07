package com.jason.petclinic.services;

import com.jason.petclinic.model.Owner;
import com.jason.petclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
