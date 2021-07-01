package jc.springframework.service.map;

import jc.springframework.model.Vet;
import jc.springframework.service.CrudService;

import java.util.Set;

public class VetServiceMap  extends AbstractMapService<Vet,Long> implements CrudService<Vet,Long> {
    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet.getId(),vet);
    }

    @Override
    public void delete(Vet vet) {
       super.delete(vet);
    }

    @Override
    public void deleteById(Long aLong) {
          super.deleteByID(aLong);
    }
}