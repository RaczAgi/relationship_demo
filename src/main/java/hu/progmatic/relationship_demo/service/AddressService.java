package hu.progmatic.relationship_demo.service;

import hu.progmatic.relationship_demo.model.Address;
import hu.progmatic.relationship_demo.repo.AddressRepository;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    public AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public Iterable<Address> getAllAddresses() {
        return addressRepository.findAll();
    }


}
