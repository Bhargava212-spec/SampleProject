package com.hcl.cs.service;

import java.util.List;

import com.hcl.cs.model.MyPets;
import com.hcl.cs.model.Pet;

public interface PetService {

	List<Pet> fetchAllPet();

	void buyPet(String string, Integer petId);

	void savePet(Pet savepet);

	List<MyPets> fetchAllMyPets(String username1);

	void deletePet(Integer petId);

}
