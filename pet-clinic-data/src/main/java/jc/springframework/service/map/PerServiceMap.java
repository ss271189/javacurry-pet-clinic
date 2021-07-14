package jc.springframework.service.map;

import jc.springframework.model.Pet;
import jc.springframework.service.CrudService;
import jc.springframework.service.PetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PerServiceMap extends AbstractMapService<Pet,Long> implements PetService {
    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet.getId(),pet);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }

    @Override
    public void deleteById(Long petID) {
       super.deleteByID(petID);
    }
}
