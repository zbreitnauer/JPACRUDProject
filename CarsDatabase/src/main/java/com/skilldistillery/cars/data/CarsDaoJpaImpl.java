package com.skilldistillery.cars.data;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.cars.entities.Cars;
@Transactional
@Service
public class CarsDaoJpaImpl implements CarsDAO {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public Cars findById(int id) {
		return em.find(Cars.class, id);
	}

}
