package com.mvit.collegeservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class CollegeController {

	@Autowired
	private CollegeService service;
	
	@PostMapping("/collegeservice")
	public void add(@RequestBody College cust)
	{
		service.insertRecord(cust);
	}
	
	
	@GetMapping("/collegeservice")
	public List<College> ShowAll()
	{
		return service.getAllRecords();
	}

	
	@GetMapping("/collegeservice/{id}")
	public College getCollegeById(@PathVariable Integer id)
	{
		return service.getCollegeById(id);
	}
	
	@DeleteMapping("/collegeservice/{id}")
	public void deleteCollege(@PathVariable Integer id)
	{
		service.deleteCollege(id);
	}
	
	@PutMapping("/collegeservice/{id}")
	public ResponseEntity<String> updateCollege(@PathVariable Integer id,@RequestBody College updatedCollege)
	{
		service.updateCollege(id,updatedCollege);
		return ResponseEntity.ok("College updated Successfully");
	}
}
