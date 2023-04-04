package com.example.demo.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Entities.Complaint;
import com.example.demo.Entities.Engineer;
import com.example.demo.Service.IEngineerService;

import java.time.LocalDate;
import java.util.List;


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
       return eng.getAllResolvedComplaints(engineer);
   }
   
   
   @GetMapping("/engineer/resolvebydate/{date}")
    public List<Complaint> getresolveSortedComplaints(@RequestBody Engineer engineer,@RequestParam("date")LocalDate date) {
      return eng.getAllResolvedComplaintsByDate(engineer, date);

    }
   
   @GetMapping("/engineer/allComp/{complaintsId}")
   public Complaint getComplaints(@RequestParam("complaintsId") Integer complaintsId) {
	return eng.getComplaints(complaintsId);
}
}
