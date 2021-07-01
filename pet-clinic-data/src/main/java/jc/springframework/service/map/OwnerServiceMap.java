package jc.springframework.service.map;

import jc.springframework.model.Owner;
import jc.springframework.service.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements CrudService<Owner,Long> {

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Owner t) {
        super.delete(t);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(),owner);
    }

    @Override
    public void deleteById(Long aLong) {
           super.deleteByID(aLong);
    }
}
