package teste;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class teste {
   public static void main(String[] args) {
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
       EntityManager em = emf.createEntityManager();
       
       System.out.println("amém");
   } 
}
