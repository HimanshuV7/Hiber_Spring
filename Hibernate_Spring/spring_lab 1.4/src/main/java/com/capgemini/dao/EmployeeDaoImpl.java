package com.capgemini.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.capg.entities.Employee;

@Component
public class EmployeeDaoImpl implements IEmployeeDao{

	private Map<Integer,Employee>store=new HashMap<>();
	
	 public EmployeeDaoImpl(){
	        store.put(100,new Employee(100,"Raja",1222.67));
	        store.put(101,new Employee(101,"Ram",2300.66));
	    }
	 
	 @Override
	 public Employee fetchById(int id) {
		 Employee employee = null;
		 if(store.containsKey(id)) {
			  employee=store.get(id);
		 }
		 return employee;
	 }
	 


}
