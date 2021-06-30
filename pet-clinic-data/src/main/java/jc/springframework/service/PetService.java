package jc.springframework.service;

import java.util.Set;
import jc.springframework.model.Pet;

public interface PetService {
   Pet findById(Long id);
   Set<Pet> findAll();
   Pet save(Pet pet);
}
