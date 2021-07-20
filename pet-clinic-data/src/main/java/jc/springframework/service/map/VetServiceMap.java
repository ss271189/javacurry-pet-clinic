package jc.springframework.service.map;

import jc.springframework.model.Speciality;
import jc.springframework.model.Vet;
import jc.springframework.service.CrudService;
import jc.springframework.service.SpecialityService;
import jc.springframework.service.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
public class VetServiceMap  extends AbstractMapService<Vet,Long> implements VetService {

    private final SpecialityService specialityService;

    public VetServiceMap(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

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

        if(vet.getSpecialities().size()>0){
            vet.getSpecialities().forEach(speciality -> {
                if(speciality.getId()==null){
                    Speciality specialitySaved=specialityService.save(speciality);
                    speciality.setId(specialitySaved.getId());
                }
            });
        }
        return super.save(vet);
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