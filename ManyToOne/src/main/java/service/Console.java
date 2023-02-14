package service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Commande;
import entity.Message;
import entity.User;

public class Console {

	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = null;
		EntityManager em = null;
		
		try {
			
			emf = Persistence.createEntityManagerFactory("my-jpa-conf");
			em = emf.createEntityManager();
			
//			Commande commande = em.find(Commande.class, 5);
//			System.out.println(commande);
//			
//			
//			Message message = em.find(Message.class, 1);
//			System.out.println(message);
			
			User u = em.find(User.class, 2);
			System.out.println(u);
			List<Commande> commandes = u.getCommandes();
			for (Commande commande : commandes) {
				System.out.println(commande);
			}
			
			List<Message> messages = u.getMessages();
			for (Message message : messages) {
				System.out.println(message);
			}
			
		} finally {
			if (emf != null) emf.close();
			if (em != null) em.close();
		}
		
	}
}
