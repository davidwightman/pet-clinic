package org.davidwightman.petclinic.services;

import org.davidwightman.petclinic.model.Pet;

import java.util.Set;

public interface VetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
