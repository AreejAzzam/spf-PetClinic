package springframework.spfpet_clinic.services;

import springframework.spfpet_clinic.model.Owner;

public interface OwnerService {
    Owner findByLastName(String lastName);
    Owner findById(Long Id);
    Owner save(Owner owner);
    Owner findAll();
}