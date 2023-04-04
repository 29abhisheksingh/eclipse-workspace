package com.cg.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.enities.Complaint;
import com.cg.enities.Engineer;
import com.cg.service.IEngineerService;




@RestController
public class EngineerController {

	
	@Autowired
	private IEngineerService eng;
	
	@GetMapping("/engineer/openComp")
	public List<Complaint> getallopenComplaints(@RequestBody Engineer engineer) {
          return eng.getAllOpenComplaints(engineer);
	}
	
	
	@GetMapping("/engineer/closeComp")
	public List<Complaint> getallcloseComplaints(@RequestBody Engineer engineer) {
          return eng.getResolvedComplaints(engineer);
	}
	
	@GetMapping("/engineer/resolvebydate")
	public List<Complaint> getresolveSortedComplaints(@RequestBody Engineer engineer, LocalDate date) {
          return eng.getResolvedComplaintsByDate(engineer, date);
	
    }
	
	@PostMapping("/engineer/resolvebydate/{id}/{s}")
	public String statuschange(@PathVariable("id")int id, @PathVariable("s")String s) {
          return eng.changeComplaintStatus(id, s);	
    }
	
}
