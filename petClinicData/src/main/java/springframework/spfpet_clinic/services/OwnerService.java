package springframework.spfpet_clinic.services;

import springframework.spfpet_clinic.model.Owner;

public interface OwnerService extends CurdServices<Owner,Long> {
    Owner findByLastName(String lastName);

}