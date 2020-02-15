package com.db.persist;

import javax.persistence.*;  
	public class PersistImage {  
	      static int id=1;
	    public void insertImage(String encoded_string)  
	    {  
	          
	        EntityManagerFactory emf=Persistence.createEntityManagerFactory("Image_details");  
	        EntityManager em=emf.createEntityManager();  
	          
	em.getTransaction().begin();  
	          
	        ImageEntity img=new ImageEntity();  
	        img.setID(id);
	        id++;
	        img.setEncoded_string(encoded_string); 
	          
	         
	          
	        em.persist(img);     
	  
	em.getTransaction().commit();  
	          
	        emf.close();  
	        em.close();  
	          
	    }  
	}  