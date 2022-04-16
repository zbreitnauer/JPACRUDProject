package com.skilldistillery.cars.data;

import java.util.List;

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

	@Override
	public List<Cars> findAll() {
		String jpql = "SELECT c FROM cars c";
		return em.createQuery(jpql, Cars.class).getResultList();
	}

	@Override
	public Cars addCar(Cars cars) {
		em.persist(cars);
		em.flush();
		return cars;
	}

	@Override
	public boolean deleteCars(int id) {
		Cars cars = em.find(Cars.class, id);
		boolean removedCars = false;
		if(cars != null) {
			em.remove(cars);
			removedCars = !em.contains(cars);
		}
			return removedCars;
	}

	@Override
	public Cars updateCars(int id, Cars cars) {
		Cars car = em.find(Cars.class, id);
		car.setYear(cars.getYear());
		car.setMake(cars.getMake());
		car.setModel(cars.getModel());
		car.setEngine(cars.getEngine());
		car.setTransmission(cars.getEngine());
		car.setDrivetrain(cars.getDrivetrain());
		car.setForceInduction(cars.getForceInduction());
		car.setMpg(cars.getMpg());
		
		em.flush();
		
		
		return car;
	}

	@Override
	public Cars findByName(String model) {
		return em.find(Cars.class, model);
	}

}
