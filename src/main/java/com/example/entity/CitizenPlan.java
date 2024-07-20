package com.example.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="CitizenDetails")
public class CitizenPlan {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CitizenId;
	private String CitizenName;
	private String PlanName;
	private String PlanStatus;
	private String Gender;
	private LocalDate StartDate;
	private LocalDate EndDate;
	private int BenifitAmount;
	private String DeniedRsn;
	private LocalDate TerminatedDate;
	private String TerminatedRsn;
	
	
	
}
