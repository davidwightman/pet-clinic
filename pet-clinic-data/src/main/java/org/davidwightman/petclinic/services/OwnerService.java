package org.davidwightman.petclinic.services;

import org.davidwightman.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
