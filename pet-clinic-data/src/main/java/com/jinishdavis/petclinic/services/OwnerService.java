package com.jinishdavis.petclinic.services;

import com.jinishdavis.petclinic.model.Owner;

public interface OwnerService extends CrudServices <Owner ,Long>{

    Owner findByLastName(String lastName);

}
