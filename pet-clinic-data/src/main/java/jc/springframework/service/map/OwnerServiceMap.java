package jc.springframework.service.map;

import jc.springframework.model.Owner;
import jc.springframework.service.CrudService;
import jc.springframework.service.OwnerService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements OwnerService {

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

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
