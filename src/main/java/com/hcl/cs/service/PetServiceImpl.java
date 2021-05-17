package com.hcl.cs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.cs.dao.PetDao;
import com.hcl.cs.model.MyPets;
import com.hcl.cs.model.Pet;

@Service
@Transactional
public class PetServiceImpl implements PetService {
	@Autowired
	private PetDao petDao;

	@Override
	public List<Pet> fetchAllPet() {
		List<Pet> petList=petDao.fetchPetList();
		return petList;
	}

	@Override
	public void buyPet(String name, Integer pet) {
		petDao.buyPet(name, pet);
		
	}

	@Override
	public void savePet(Pet savepet) {
		petDao.savePet(savepet);
		
	}

	@Override
	public List<MyPets> fetchAllMyPets(String username1) {
		List<MyPets> mypets=petDao.fetchAllMyPets(username1);
		return mypets;
	}

	@Override
	public void deletePet(Integer petId) {
		petDao.deletePet(petId);
		
	}

	

}
