package main;

import entity.Naming;
import notentity.Bus;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Main {



    public static void main(String[] args) {
        // Open a database connection
        // (create a new database if it doesn't exist yet):
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "NewPersistenceUnit" );

        EntityManager entitymanager = emfactory.createEntityManager( );

        // Store 1000 Point objects in the database:
        entitymanager.getTransaction().begin();

        Naming naming = new Naming( );
        naming.setId(8);
        naming.setNumber("Test9" );
        entitymanager.persist( naming );
        entitymanager.getTransaction( ).commit( );
        // Find the number of objects in the database:
        Query q3 = entitymanager.createQuery("SELECT a FROM entitybus a");
        Query q1 = entitymanager.createQuery("SELECT count(p) FROM Naming p");
        Query q2 = entitymanager.createQuery("select a from prefix$MyEntity_entity_name a where a.prefixTest = a.eid");
           /* Entitybus entitybus = new Entitybus( );
            entitybus.setEid(11);
            entitybus.setEnumber("Test4" );
            entitymanager.persist( entitybus );
            entitymanager.getTransaction( ).commit( );
            // Find the number of objects in the database:
            Query q1 = entitymanager.createQuery("SELECT count(p) FROM Entitybus p");*/


        System.out.println("Total : " + q1.getSingleResult());
        // Close the database connection:
        entitymanager.close();
        emfactory.close();
    }

}