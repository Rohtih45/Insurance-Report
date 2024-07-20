package com.example.Runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.entity.CitizenPlan;
import com.example.repository.CitizenRepository;
@Component
public class DataLoader implements ApplicationRunner{
	
	@Autowired
	private CitizenRepository repo;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		repo.deleteAll();
		
		//Cash
		CitizenPlan c1 = new CitizenPlan();
		c1.setCitizenName("Vamshi");
		c1.setPlanName("Cash");
		c1.setPlanStatus("Approved");
		c1.setGender("Male");
		c1.setStartDate(LocalDate.now().minusMonths(4));
		c1.setEndDate(LocalDate.now().plusMonths(6));
		c1.setBenifitAmount(5000);
		
		CitizenPlan c2 = new CitizenPlan();
		c2.setCitizenName("Mahesh");
		c2.setPlanName("Cash");
		c2.setPlanStatus("Denied");
		c2.setGender("Male");
		c2.setStartDate(LocalDate.now().minusMonths(4));
		c2.setEndDate(LocalDate.now().plusMonths(6));
		c2.setDeniedRsn("Ditribution Bussiness");
		
		CitizenPlan c3 = new CitizenPlan();
		c3.setCitizenName("Supraja");
		c3.setPlanName("Cash");
		c3.setPlanStatus("Terminated");
		c3.setGender("Female");
		c3.setStartDate(LocalDate.now().minusMonths(4));
		c3.setEndDate(LocalDate.now().plusMonths(6));
		c3.setBenifitAmount(5000);
		c3.setTerminatedDate(LocalDate.now());
		c3.setTerminatedRsn("Employed");

		CitizenPlan c4 = new CitizenPlan();
		c4.setCitizenName("Sai");
		c4.setPlanName("Food");
		c4.setPlanStatus("Approved");
		c4.setGender("Male");
		c4.setStartDate(LocalDate.now().minusMonths(4));
		c4.setEndDate(LocalDate.now().plusMonths(6));
		c4.setBenifitAmount(5000);
		
		CitizenPlan c5 = new CitizenPlan();
		c5.setCitizenName("RK");
		c5.setPlanName("Food");
		c5.setPlanStatus("Denied");
		c5.setGender("Male");
		c5.setStartDate(LocalDate.now().minusMonths(4));
		c5.setEndDate(LocalDate.now().plusMonths(6));
		c5.setDeniedRsn("Ditribution Bussiness");
		
		CitizenPlan c6 = new CitizenPlan();
		c6.setCitizenName("Deeksha");
		c6.setPlanName("Food");
		c6.setPlanStatus("Terminated");
		c6.setGender("Female");
		c6.setStartDate(LocalDate.now().minusMonths(4));
		c6.setEndDate(LocalDate.now().plusMonths(6));
		c6.setBenifitAmount(5000);
		c6.setTerminatedDate(LocalDate.now());
		c6.setTerminatedRsn("Employed");
		
		CitizenPlan c7 = new CitizenPlan();
		c7.setCitizenName("Vijay");
		c7.setPlanName("Medical");
		c7.setPlanStatus("Approved");
		c7.setGender("Male");
		c7.setStartDate(LocalDate.now().minusMonths(4));
		c7.setEndDate(LocalDate.now().plusMonths(6));
		c7.setBenifitAmount(5000);
		
		CitizenPlan c8 = new CitizenPlan();
		c8.setCitizenName("Varun");
		c8.setPlanName("Medical");
		c8.setPlanStatus("Denied");
		c8.setGender("Male");
		c8.setStartDate(LocalDate.now().minusMonths(4));
		c8.setEndDate(LocalDate.now().plusMonths(6));
		c8.setDeniedRsn("Ditribution Bussiness");
		
		CitizenPlan c9 = new CitizenPlan();
		c9.setCitizenName("SocialMadam");
		c9.setPlanName("Employment");
		c9.setPlanStatus("Terminated");
		c9.setGender("Female");
		c9.setStartDate(LocalDate.now().minusMonths(4));
		c9.setEndDate(LocalDate.now().plusMonths(6));
		c9.setBenifitAmount(5000);
		c9.setTerminatedDate(LocalDate.now());
		c9.setTerminatedRsn("Employed");
		
		CitizenPlan c10 = new CitizenPlan();
		c10.setCitizenName("Puneeth");
		c10.setPlanName("Employment");
		c10.setPlanStatus("Approved");
		c10.setGender("Male");
		c10.setStartDate(LocalDate.now().minusMonths(4));
		c10.setEndDate(LocalDate.now().plusMonths(6));
		c10.setBenifitAmount(5000);
		
		CitizenPlan c11 = new CitizenPlan();
		c11.setCitizenName("Pavan");
		c11.setPlanName("Employment");
		c11.setPlanStatus("Denied");
		c11.setGender("Male");
		c11.setStartDate(LocalDate.now().minusMonths(4));
		c11.setEndDate(LocalDate.now().plusMonths(6));
		c11.setDeniedRsn("Ditribution Bussiness");
		
		CitizenPlan c12 = new CitizenPlan();
		c12.setCitizenName("taruni");
		c12.setPlanName("Medical");
		c12.setPlanStatus("Terminated");
		c12.setGender("Female");
		c12.setStartDate(LocalDate.now().minusMonths(4));
		c12.setEndDate(LocalDate.now().plusMonths(6));
		c12.setBenifitAmount(5000);
		c12.setTerminatedDate(LocalDate.now());
		c12.setTerminatedRsn("Employed");
		
		List<CitizenPlan> list = Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12);
		repo.saveAll(list);
		
		
		
		
	}
	

}
