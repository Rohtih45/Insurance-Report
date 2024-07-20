package com.example.Request;

import java.time.LocalDate;

import lombok.Data;

@Data
public class SearchRequest {
	
	private String PlanName;
	private String PlanStatus;
	private String Gender;
	private LocalDate StartDate;
	private LocalDate EndDate;
	public String getPlanName() {
		return PlanName;
	}
	public void setPlanName(String planName) {
		PlanName = planName;
	}
	public String getPlanStatus() {
		return PlanStatus;
	}
	public void setPlanStatus(String planStatus) {
		PlanStatus = planStatus;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public LocalDate getStartDate() {
		return StartDate;
	}
	public void setStartDate(LocalDate startDate) {
		StartDate = startDate;
	}
	public LocalDate getEndDate() {
		return EndDate;
	}
	public void setEndDate(LocalDate endDate) {
		EndDate = endDate;
	}
	@Override
	public String toString() {
		return "SearchRequest [PlanName=" + PlanName + ", PlanStatus=" + PlanStatus + ", Gender=" + Gender
				+ ", StartDate=" + StartDate + ", EndDate=" + EndDate + "]";
	}
	
	

}
