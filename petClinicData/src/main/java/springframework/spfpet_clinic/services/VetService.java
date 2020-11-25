package springframework.spfpet_clinic.services;

import springframework.spfpet_clinic.model.Vet;

public interface VetService {
    Vet findById(Long Id);
    Vet save(Vet vet);
    Vet findAll();
}
