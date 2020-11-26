package springframework.spfpet_clinic.services.map;

import springframework.spfpet_clinic.model.Owner;
import springframework.spfpet_clinic.services.CurdServices;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapServices<Owner,Long> implements CurdServices<Owner,Long> {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void deleteByID(Long id) {
         super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
         super.delete(object);
    }
}
