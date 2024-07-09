package com.example.bankingapp.dto;


import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

@Data
//@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class AccountDto {

	private Long id;
	private String accountHolderName;
	private double balance;

	public AccountDto(String accountHolderName, Long id, double balance) {
		this.accountHolderName = accountHolderName;
		this.id = id;
		this.balance = balance;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public AccountDto(Long id, String accountHolderName, double balance) {
		this.id = id;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
}
