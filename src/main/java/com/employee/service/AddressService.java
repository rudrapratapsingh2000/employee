package com.employee.service;

import com.employee.model.Address;
import com.employee.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    IAddressRepo iAddressRepo;

    public List<Address> getAllAddress() {
        return iAddressRepo.findAll();
    }

    public Address getAddress(Long id) {
        return iAddressRepo.findById(id).get();
    }

    public String addAddress(Address address) {
        iAddressRepo.save(address);
        return "Address added Successfuly";
    }

    public String updateAddress(Long id, Address address) {
        Address address1=iAddressRepo.findById(id).get();
        address1.setCity(address.getCity());
        address1.setState(address.getState());
        address1.setStreet(address.getStreet());
        address1.setZipcode(address.getZipcode());
        iAddressRepo.save(address1);
        return "Address updated Successfully";
    }

    public String deleteAddress(Long id) {
        iAddressRepo.deleteById(id);
        return "Address deleted Successfully";
    }
}
