package com.gestion.g1;

import com.gestion.g1.models.Objet;
import com.gestion.g1.repositories.ObjetRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class G1ApplicationTests {
	@Autowired
	ObjetRepository objetRepository;

	@Test
	public void TestCreateObjet() {
		Objet objet = new Objet("tasse", "12 unité blanc","user");
		objetRepository.save(objet);
	}
	@Test
	public void TestUpdateObjet() {
		Objet objet = objetRepository.findById(1L).get();
		objet.setDescriptionObjet("10 unité blanc");
		objetRepository.save(objet);
	}
	@Test
	public void TestFindObjet() {
		Objet objet = objetRepository.findById(1L).get();
		System.out.println(objet);
	}
	@Test
	public void TestFindAllObjet() {
		List<Objet> objets = objetRepository.findAll();
		objets.forEach(System.out::println);
	}
	@Test
	public void TestDeleteObjet() {
		objetRepository.deleteById(2L);
	}
}
