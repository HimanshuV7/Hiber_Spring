package org.capgemini.entities;

import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name = "Customers")
public class Customer {
	
	
	@Id
	@GeneratedValue
	private int cust_Id;
	
	//@Column(name = "custname")
	private String cust_Name;
	
	public int getcust_Id() {
		return cust_Id;
	}
	public void setcust_Id(int cust_Id) {
		this.cust_Id = cust_Id;
	}
	public String getcust_Name() {
		return cust_Name;
	}
	public void setcust_Name(String cust_Name) {
		this.cust_Name = cust_Name;
	}
	

	@Override
	public int hashCode() {
	return Objects.hash(cust_Id);
	}
	@Override
	public boolean equals(Object obj) {
		 if (this == obj) {
	            return true;
	        }
	        if (obj == null || getClass() != obj.getClass()) {
	            return false;
	        }
	        Customer customer = (Customer) obj;
	        return cust_Id == customer.cust_Id;
	}
}
