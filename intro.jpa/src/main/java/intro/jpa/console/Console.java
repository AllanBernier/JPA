package intro.jpa.console;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.github.javafaker.Faker;

import intro.jpa.entity.Photo;
import intro.jpa.entity.Product;
import intro.jpa.entity.ProductDetails;
import intro.jpa.entity.User;

public class Console {

	
	public static void main(String[] args) {

		EntityManagerFactory emf = null;
		EntityManager em = null;
		try {
            emf = Persistence.createEntityManagerFactory("my-jpa-conf");
            em = emf.createEntityManager();
            
            // GET ------ Retrieve/ SELECT
//            User user = em.find(User.class, 4); 
//            System.out.println(user);
            
            // GET ALL
            
//            List<User> users = em.createQuery("From User", User.class).getResultList();
//            for( User u : users) {
//            	System.out.println(u);
//            }
            
            
            // UPDATE 
//            User user = em.find(User.class, 4); 
//
//            EntityTransaction trans = em.getTransaction();
//            trans.begin();
//            
//            user.setFirstName("Toto");
//            user.setAge(2);
//            em.persist(user);
//            
//            trans.commit();
            
//            // CREATE
//            Faker faker = new Faker();
//            String firstName = faker.name().firstName();
//            String lastName = faker.name().lastName();
//         
//            User newUser = new User(firstName, lastName, firstName +"@"+ lastName + ".com", faker.number().randomDigit());
//            EntityTransaction trans = em.getTransaction();
//            trans.begin();
//            
//            em.persist(newUser);
//            
//            trans.commit();
            
            // DELETE
//	          User user = em.find(User.class, 5); 
//	
//	          EntityTransaction trans = em.getTransaction();
//	          trans.begin();
//	          em.remove(user);
//	          trans.commit();
	            

//            EntityTransaction trans = em.getTransaction();
//
//            trans.begin();
//            
//            Photo getPhoto = em.find(Photo.class, 1);
//            getPhoto.setLocalisation("France");
//            em.persist(getPhoto);
//            
//            Photo newPhoto = new Photo("myphotos/8", "Namibie", "lala");
//            em.persist(newPhoto);
//            
//            Photo removePhoto = em.find(Photo.class, 2);
//            em.remove(removePhoto);
//            
//            trans.commit();
//            
            ProductDetails productD = em.find(ProductDetails.class, 1);
            System.out.println(productD);
            
            System.out.println(productD.getProduct());
            
            System.out.println(productD == productD.getProduct().getProductDetails());
            
            
        } finally {
            if ( em != null ) em.close();
            if ( emf != null ) emf.close();
        }
		
	}
}


/*
 * 
 * 1. Créer une table photo : URL, localisation, nom
 * 2. Entity Photo
 * 3. 
 */










