package com.hcl.cs.dao;

import java.util.List;

import com.hcl.cs.model.MyPets;
import com.hcl.cs.model.Pet;

public interface PetDao {

	List<Pet> fetchPetList();

	void buyPet(String name, Integer pet);

	void savePet(Pet savepet);

	List<MyPets> fetchAllMyPets(String username1);

	void deletePet(Integer petId);

}
