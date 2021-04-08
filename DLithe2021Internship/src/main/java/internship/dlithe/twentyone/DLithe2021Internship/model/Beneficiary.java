package internship.dlithe.twentyone.DLithe2021Internship.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Beneficiary 
{
	@Id
	private Long accountNumber;
	private String name, ifsc, bank;
	@Override
	public String toString() {
		return "Beneficiary [accountNumber=" + accountNumber + ", name=" + name + ", ifsc=" + ifsc + ", bank=" + bank
				+ "]";
	}
	public Beneficiary() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Beneficiary(Long accountNumber, String name, String ifsc, String bank) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.ifsc = ifsc;
		this.bank = bank;
	}
	public Long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	
}
