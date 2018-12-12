package com.jinishdavis.petclinic.services.map;

import com.jinishdavis.petclinic.model.Owner;
import com.jinishdavis.petclinic.services.CrudServices;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner ,Long> implements CrudServices<Owner,Long> {


    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {

        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {

        super.delete(object);
    }

    @Override
    public Owner findById(Long id) {
        return super.findByID(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(),object);
    }
}