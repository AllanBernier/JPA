package service;

import java.util.Iterator;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Skill;
import entity.User;

public class Console {

	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = null;
		EntityManager em = null;
		
		try {
			
			emf = Persistence.createEntityManagerFactory("my-jpa-conf");
			em = emf.createEntityManager();
			
			User u = em.find(User.class, 2);
			System.out.println(u);
			for (Skill skill : u.getSkills()) {
				System.out.println(skill);
			}
			
			System.out.println("=============================");
			
			Skill s = em.find(Skill.class, 1);
			System.out.println(s);
			for (User user : s.getUsers()) {
				System.out.println(user);
			}
			
		} finally {
			if (emf != null) emf.close();
			if (em != null) em.close();
		}
		
	}
}
