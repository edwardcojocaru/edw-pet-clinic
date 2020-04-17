package edw.spring.edwpetclinic.services;

import edw.spring.edwpetclinic.model.Owner;

import java.util.Set;

/**
 * @author Eduard.Cojocaru
 */
public interface OwnerServices {
    Owner findByLastName(String lastName);
    Owner findById();
    Owner save(Owner owner);
    Set<Owner> findAll();
}
