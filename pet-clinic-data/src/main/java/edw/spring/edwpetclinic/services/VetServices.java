package edw.spring.edwpetclinic.services;

import edw.spring.edwpetclinic.model.Owner;
import edw.spring.edwpetclinic.model.Vet;

import java.util.Set;

/**
 * @author Eduard.Cojocaru
 */
public interface VetServices {
    Vet findById();
    Vet save(Vet owner);
    Set<Vet> findAll();
}
