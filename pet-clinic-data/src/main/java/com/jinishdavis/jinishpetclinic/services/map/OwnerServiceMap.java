package com.jinishdavis.jinishpetclinic.services.map;

import com.jinishdavis.jinishpetclinic.model.Owner;
import com.jinishdavis.jinishpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner ,Long> implements OwnerService {


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
        return super.save(object);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }


}
