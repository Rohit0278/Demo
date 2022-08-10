package com.example.project1App.model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Employee {

	 @Id
		private Integer EmployeId;
		private String Name;
		private String Address;
		private Integer Mobile;
		public Employee(Integer employeId, String name, String address, Integer mobile) {
			super();
			EmployeId = employeId;
			Name = name;
			Address = address;
			Mobile = mobile;
		}
		public Integer getEmployeId() {
			return EmployeId;
		}
		public void setEmployeId(Integer employeId) {
			EmployeId = employeId;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getAddress() {
			return Address;
		}
		public void setAddress(String address) {
			Address = address;
		}
		public Integer getMobile() {
			return Mobile;
		}
		public void setMobile(Integer mobile) {
			Mobile = mobile;
		}
		
		
	
		
	}

