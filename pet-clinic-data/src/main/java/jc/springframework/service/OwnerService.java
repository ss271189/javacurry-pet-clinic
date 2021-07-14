package jc.springframework.service;

import jc.springframework.model.Owner;

public interface OwnerService extends CrudService<Owner,Long>{
    Owner findByLastName(String lastName);
}
