package com.skilldistillery.cars.entities;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarTest {
	
	
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Cars cars;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("JPACars");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		cars = em.find(Cars.class,1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		cars = null;
	}

	@Test
	void test_Cars_entity_mapping() {
		assertNotNull(cars);
		assertEquals("Civic Type R", cars.getModel());
	}

}
