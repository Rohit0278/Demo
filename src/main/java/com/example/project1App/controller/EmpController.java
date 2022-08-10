package com.example.project1App.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.project1App.repository.EmpHelp;


@RestController
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired
	private EmpService empservice;
	
	@PostMapping("/upload")
	public ResponseEntity<?> upload(@RequestParam("file") MultipartFile file){
		if(EmpHelp.checkExcelFormat(file)) {
			this.empservice.save(file);
			
			return ResponseEntity.ok(Map.of("Message","File is Uploaded"));
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("please send Excel data");
	}

}
