package springframework.spfpet_clinic.services.map;

import springframework.spfpet_clinic.model.Vet;
import springframework.spfpet_clinic.services.CurdServices;

import java.util.Set;

public class VetServiceMap extends AbstractMapServices<Vet,Long>implements CurdServices<Vet,Long> {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void deleteByID(Long id) {
super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
super.delete(object);
    }
}
