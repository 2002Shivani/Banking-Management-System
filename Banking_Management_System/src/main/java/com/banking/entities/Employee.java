package com.banking.entities;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="Bank_Employee")
public class Employee {

	@Id
	private String empID;
	private String empName;
	private String empPassword;
	private String empRole;
	private long empMobile;
	private String empAddress;
	
	
	@ManyToOne
	@Autowired
	private Role role; 
	
	
	
	
}
