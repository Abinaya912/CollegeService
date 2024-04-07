package com.mvit.collegeservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

@Service
@Transactional

public class CollegeService {

	@Autowired
	private CollegeRepository repo;
	//Inserting the records to the table in database
	public void insertRecord(College cust)
	{
		repo.save(cust);
	}
	
	//Show all the records from the table in database
	public List<College> getAllRecords()
	{
		return repo.findAll();
	}
	
	//Show specific record from the table in database
	public College getCollegeById(Integer id)
	{
		return repo.findById(id).orElse(null);
	}
	
	//Deleting the specific record from the table in database
	public void deleteCollege(Integer id)
	{
		repo.deleteById(id);
	}
	
	//updating the existing record
	public void updateCollege(Integer id,College updateCollege)
	{
		College existingCollege=repo.findById(id).orElse(null);
		if(existingCollege!=null)
		{
			existingCollege.setCid(updateCollege.getCid());
			existingCollege.setCname(updateCollege.getCname());
			existingCollege.setAddress(updateCollege.getAddress());
			repo.save(existingCollege);
		}
	}

	public College getStudentById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
}
