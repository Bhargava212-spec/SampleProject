package com.hcl.cs.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.cs.model.MyPets;
import com.hcl.cs.model.Pet;
import com.hcl.cs.model.User;
@Repository
public class PetDaoImpl implements PetDao {
	@Autowired 
	private SessionFactory sessionFactory;
	

	@Override
	public List<Pet> fetchPetList() {
		Query query=sessionFactory.getCurrentSession().createQuery("select p from Pet p");
		List petlist=query.list();
		return petlist;
	}


	@Override
	public void buyPet(String userName,Integer petId) {
		
		Pet pet=(Pet)sessionFactory.getCurrentSession().get(Pet.class, petId);
		MyPets mypet=new MyPets();
		mypet.setUserName(userName);
		mypet.setPetId(pet.getPetId());
		mypet.setPetName(pet.getPetName());
		mypet.setPetAge(pet.getPetAge());
		mypet.setPetPlace(pet.getPetPlace());
		sessionFactory.getCurrentSession().save(mypet);
		
	}


	@Override
	public void savePet(Pet savepet) {
		sessionFactory.getCurrentSession().save(savepet);	
	}


	@Override
	public List<MyPets> fetchAllMyPets(String username1) {
		SQLQuery q=sessionFactory.getCurrentSession().createSQLQuery("select * from mypets where userName=:abc");
		q.setParameter("abc", username1);
		q.addEntity(MyPets.class);
		List mypets=q.list();		
		return mypets;
	}


	@Override
	public void deletePet(Integer petId) {
		Pet p=(Pet)sessionFactory.getCurrentSession().get(Pet.class, petId);
		sessionFactory.getCurrentSession().delete(p);
		
	}
	

}
