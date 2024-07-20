package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.Service.ReportService;
import com.example.entity.CitizenPlan;

@Controller
public class ReportController {
	
	@Autowired
	private ReportService service;
	
	@GetMapping("/index")
	public String indexPage() {
		return "index";
	}
	
	@GetMapping("/PlnNme")
	public ResponseEntity<List<String>> getplanname() {
		
		List<String> msg = service.getPlanName();
		return new ResponseEntity<List<String>>(msg, HttpStatus.OK);
		
	}
	@GetMapping("/Plnstus")
	public ResponseEntity<List<String>> getplanstatus() {
		
		List<String> msg = service.getPlanStaus();
		return new ResponseEntity<List<String>>(msg, HttpStatus.OK);
		
	}
	
	@GetMapping("/{bookId}")
	public ResponseEntity<List<CitizenPlan>> SearchReq(@PathVariable String PlanName) {
		
		List<CitizenPlan> msg = service.getSearcDetails(PlanName);
		return new ResponseEntity<List<CitizenPlan>>(msg, HttpStatus.OK);
		
	}

}
