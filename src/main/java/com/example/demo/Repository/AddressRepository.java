package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
