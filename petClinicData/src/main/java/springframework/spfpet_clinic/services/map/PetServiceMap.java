package springframework.spfpet_clinic.services.map;

import springframework.spfpet_clinic.model.Pet;
import springframework.spfpet_clinic.services.CurdServices;

import java.util.Set;

public class PetServiceMap  extends AbstractMapServices <Pet,Long >implements CurdServices<Pet,Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void deleteByID(Long id) {
       super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
       super.delete(object);
    }
}
