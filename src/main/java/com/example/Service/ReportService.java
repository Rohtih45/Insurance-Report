package com.example.Service;

import java.util.List;

import com.example.entity.CitizenPlan;
import com.example.Request.SearchRequest;

public interface ReportService {
	
	public List<String> getPlanName();
	
	public List<String> getPlanStaus();
	
	public List<CitizenPlan> getSearcDetails(String planName);
	
	public Boolean ExportPdf();
	
	public Boolean ExportExcel();

}
