package com.example.demo.entity;

import java.math.BigInteger;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee")
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "first_name")
	private String firstName;
	@Column(name = "Last_name")
	private String lastName;
	private String email;
	
	@Column(name = "birth_date")
    private LocalDate birthDate;
	
	
	 private String phoneNumber;
	private BigInteger salary; // BigInteger is a non-primitive data type
	//UNIDIRECTIONAL ONETOONE
	@OneToOne(cascade = CascadeType.PERSIST )
	@JoinColumn(name="add_id",referencedColumnName="id")
	private Address address;
	
	//UNIDIRECTIONAL ONETOONE
	@ManyToOne
	@JoinColumn(name="dep_id",referencedColumnName="id")
	private Department department;

}