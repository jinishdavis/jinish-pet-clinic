package com.jinishdavis.jinishpetclinic.services;

import com.jinishdavis.jinishpetclinic.model.Owner;



public interface OwnerService extends CrudServices <Owner ,Long>{

    Owner findByLastName(String lastName);

}
