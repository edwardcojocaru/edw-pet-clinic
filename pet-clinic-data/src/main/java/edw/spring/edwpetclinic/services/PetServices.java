package edw.spring.edwpetclinic.services;

import edw.spring.edwpetclinic.model.Owner;
import edw.spring.edwpetclinic.model.Pet;

import java.util.Set;

/**
 * @author Eduard.Cojocaru
 */
public interface PetServices {
    Pet findById();
    Pet save(Pet owner);
    Set<Pet> findAll();
}
