package com.example.project1App.controller;

import java.util.List;

import org.hibernate.boot.model.source.internal.hbm.Helper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.project1App.model.Employee;
import com.example.project1App.repository.*;
public class EmpService {
	
	@Autowired
	private EmpRepo emprepo;
	
	public void save(MultipartFile file) {
		try {
			List<Employee> employe= Helper.convertExcelToListofemploye(file.getInputStream());
			this.emprepo.saveAll(employe);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
