package internship.dlithe.twentyone.DLithe2021Internship.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import internship.dlithe.twentyone.DLithe2021Internship.model.Beneficiary;

@Service
public class ServiceBeneficiary 
{
	@Autowired
	RepoBeneficiary repo;
	
	public Beneficiary add(Beneficiary ben)
	{
		return repo.save(ben);
	}
	
	public List<Beneficiary> getAll()
	{
		return repo.findAll();
	}
	
	public Optional<Beneficiary> extractOne(Long id)
	{
		return repo.findById(id);
	}
}