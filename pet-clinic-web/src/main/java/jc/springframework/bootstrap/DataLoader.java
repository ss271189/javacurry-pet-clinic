package jc.springframework.bootstrap;

import jc.springframework.model.*;
import jc.springframework.service.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
    }

    @Override
    public void run(String... args) throws Exception {
        int count= petTypeService.findAll().size();
        System.out.println("-----------------------------> Total count-"+ count);
        if (count==0)
        loadData();
         count= petTypeService.findAll().size();
        System.out.println("---------------------------->Total count-"+ count);
    }

    private void loadData() {
        PetType pt1=new PetType();
        pt1.setName("Dog");
        PetType dogPT=petTypeService.save(pt1);

        PetType pt2=new PetType();
        pt2.setName("Cat");
        PetType catPT=petTypeService.save(pt2);

        Speciality sp1=new Speciality();
        sp1.setDescription("radiology");
        Speciality sp2=new Speciality();
        sp2.setDescription("Surgery");
        Speciality sp3=new Speciality();
        sp3.setDescription("Dentistry");

        Speciality savedR=specialityService.save(sp1);
        Speciality savedS=specialityService.save(sp2);
        Speciality savedD=specialityService.save(sp3);

        Owner o1=new Owner();
        //o1.setId(1L);
        o1.setFirstName("Shashank");
        o1.setLastName("Saurabh");
        o1.setAddress("rN");
        o1.setCity("Gopalganj");
        o1.setTelephone("1234567890");


        Pet myPet=new Pet();
        myPet.setName("Sheru");
        myPet.setBirthDate(LocalDate.now());
        myPet.setOwner(o1);
        myPet.setPetType(dogPT);
        o1.getPets().add(myPet);

        ownerService.save(o1);

        Owner o2=new Owner();
        //o2.setId(2L);
        o2.setFirstName("Surbhi");
        o2.setLastName("Rani");

        Pet myCat=new Pet();
        myCat.setName("Chinna");
        myCat.setBirthDate(LocalDate.now());
        myCat.setOwner(o2);
        myCat.setPetType(catPT);
        o2.getPets().add(myCat);

        ownerService.save(o2);

        Vet v1=new Vet();
        v1.setFirstName("Raj");
        v1.setLastName("Dubey");
        v1.getSpecialities().add(savedR);
        vetService.save(v1);

        Vet v2=new Vet();
        v2.setFirstName("Rajni");
        v2.setLastName("Dubey");
        v2.getSpecialities().add(savedS);

        vetService.save(v2);
    }
}
