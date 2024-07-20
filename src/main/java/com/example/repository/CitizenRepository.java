package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.entity.CitizenPlan;

public interface CitizenRepository extends JpaRepository<CitizenPlan, Integer>{    
	
	@Query("select distinct(PlanName) from CitizenPlan")
	public List<String> getPlanName();
	
	@Query("select distinct(PlanStatus) from CitizenPlan")
	public List<String> getPlanStatus();
	
	public List<CitizenPlan> findByPlanName(String name);
	
	public List<CitizenPlan> findByPlanStatus(String name);

}
