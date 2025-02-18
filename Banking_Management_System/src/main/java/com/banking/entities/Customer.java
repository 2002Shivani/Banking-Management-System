package com.banking.entities;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customer {
	
	@Id
	private long accountNumber;
	private String custName;
	private String custDOB;
	private String accountOpningDate;
	private String custAddress;
	private long custPhone;
	private String accountType;
	
	@ManyToOne
	@Autowired
	private Bank bank; 
	
 
	
	

}
