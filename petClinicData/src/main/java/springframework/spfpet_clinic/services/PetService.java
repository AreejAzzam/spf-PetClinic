package springframework.spfpet_clinic.services;

import springframework.spfpet_clinic.model.Pet;

public interface PetService {
    Pet findById(Long Id);
    Pet save(Pet pet);
    Pet findAll();
}
