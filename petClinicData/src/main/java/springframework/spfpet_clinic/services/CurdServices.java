package springframework.spfpet_clinic.services;

import java.util.Set;

public interface CurdServices <T,ID> {
    Set<T> findAll();
    T findById(ID id);
    T save(T object);
    void deleteByID(ID id);
    void delete(T object);


}
