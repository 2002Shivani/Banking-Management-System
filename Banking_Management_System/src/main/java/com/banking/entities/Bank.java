package com.banking.entities;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Bank {
	
	@Id
	private int branchCode;
	private Long bankCIF;
	private String bankName;
	private String bankAddress;
	private String bankIFSC;
	private String bankMobile;
	private String bankEmail;
	private String branchManager;
	
	
	
	
}
