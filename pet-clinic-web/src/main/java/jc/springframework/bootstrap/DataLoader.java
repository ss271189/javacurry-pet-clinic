package jc.springframework.bootstrap;

import jc.springframework.model.Owner;
import jc.springframework.model.Vet;
import jc.springframework.service.OwnerService;
import jc.springframework.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner o1=new Owner();
        //o1.setId(1L);
        o1.setFirstName("Shashank");
        o1.setLastName("Saurabh");

        ownerService.save(o1);

        Owner o2=new Owner();
        //o2.setId(2L);
        o2.setFirstName("Surbhi");
        o2.setLastName("Rani");

        ownerService.save(o2);

        Vet v1=new Vet();
        //v1.setId(1L);
        v1.setFirstName("Raj");
        v1.setLastName("Dubey");

        vetService.save(v1);

        Vet v2=new Vet();
        //v2.setId(2L);
        v2.setFirstName("Rajni");
        v2.setLastName("Dubey");

        vetService.save(v2);

    }
}
