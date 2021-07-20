package jc.springframework.service.map;

import jc.springframework.model.Speciality;
import jc.springframework.service.SpecialityService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecialityServiceMap extends AbstractMapService<Speciality, Long> implements SpecialityService {
    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality save(Speciality t) {
        return super.save(t);
    }

    @Override
    public void delete(Speciality t) {
       super.delete(t);
    }

    @Override
    public void deleteById(Long aLong) {
       super.deleteByID(aLong);
    }
}
