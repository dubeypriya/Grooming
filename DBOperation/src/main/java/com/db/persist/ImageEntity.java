package com.db.persist;

import javax.persistence.*;  
	  
	@Entity  
	@Table(name="Image")  
	public class ImageEntity {  
	  
	     
	    private String encoded_string; 
	    @Id private int ID;
	    
	      
	    public ImageEntity(String encoded_string, int ID) {  
	        super();  
	        this.encoded_string=encoded_string;
	        this.ID=ID;
	    }  
	    
	    public ImageEntity() {  
	        super();  
	    }

		public String getEncoded_string() {
			return encoded_string;
		}

		public void setEncoded_string(String encoded_string) {
			this.encoded_string = encoded_string;
		}

		public int getID() {
			return ID;
		}

		public void setID(int iD) {
			ID = iD;
		}
	    
	}