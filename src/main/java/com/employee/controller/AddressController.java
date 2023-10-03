package com.employee.controller;

import com.employee.model.Address;
import com.employee.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address-app")
public class AddressController {
    @Autowired
    AddressService addressService;
    @GetMapping("/addresses")
    public List<Address> getAllAddress(){
        return addressService.getAllAddress();
    }
    @PostMapping("/address/id/{id}")
    public Address getAddress(@PathVariable Long id){
        return addressService.getAddress(id);
    }
@PostMapping("/address")
    public String addAddress(@RequestBody Address address){
        return addressService.addAddress(address);
}
    @PutMapping("/update/id{id}")
    public String updateAddress(@PathVariable Long id,@RequestBody Address address){
        return  addressService.updateAddress(id,address);
    }
    @DeleteMapping("/address/id{id}")
    public  String deleteAddress(@PathVariable Long id){
        return addressService.deleteAddress(id);
    }
}
