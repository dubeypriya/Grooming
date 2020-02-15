package com.db.persist;

import java.awt.List;
import java.util.Iterator;

import javax.persistence.*;  
	public class ReadImagePersist {  
	      
	    public ImageEntity readImage(int id)  
	    {  
	          
	        EntityManagerFactory emf=Persistence.createEntityManagerFactory("Image_details");  
	        EntityManager em=emf.createEntityManager();  
	          
	em.getTransaction().begin();  
	          
	        ImageEntity img=new ImageEntity();  
	        
	        img = em.getReference(ImageEntity.class, id);           
	em.getTransaction().commit();  
	          
	        emf.close();  
	        em.close(); 
	        return img;
	          
	    }  
	}  