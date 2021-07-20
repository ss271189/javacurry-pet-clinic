package jc.springframework.service.map;


import jc.springframework.model.PetType;
import jc.springframework.service.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetTypeMapService extends AbstractMapService<PetType,Long> implements PetTypeService {

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType save(PetType petType) {
        return super.save(petType);
    }

    @Override
    public void delete(PetType petType) {
       super.delete(petType);
    }

    @Override
    public void deleteById(Long aLong) {
       super.deleteByID(aLong);
    }
}
