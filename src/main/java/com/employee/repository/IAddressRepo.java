package com.employee.repository;

import com.employee.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends JpaRepository<Address,Long> {
}
