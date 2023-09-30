package hu.progmatic.relationship_demo.controller;

import hu.progmatic.relationship_demo.model.Address;
import hu.progmatic.relationship_demo.repo.AddressRepository;
import hu.progmatic.relationship_demo.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/addresses")
public class AddressController {
    private final AddressService addressService;
@Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping
    public Iterable<Address> getAllAddresses() {
        return addressService.getAllAddresses();
    }

}
