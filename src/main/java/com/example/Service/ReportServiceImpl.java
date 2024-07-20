package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.CitizenPlan;
import com.example.repository.CitizenRepository;
import com.example.Request.SearchRequest;
@Service
public class ReportServiceImpl implements ReportService {
	
	@Autowired
	private CitizenRepository Repo;

	@Override
	public List<String> getPlanName() {
		// TODO Auto-generated method stub
		
		return Repo.getPlanName();
	}

	@Override
	public List<String> getPlanStaus() {
		// TODO Auto-generated method stub
		return Repo.getPlanStatus();
	}

	@Override
	public List<CitizenPlan> getSearcDetails(String req) {
		// TODO Auto-generated method stub	
		CitizenPlan c1 = new CitizenPlan();
		return Repo.findByPlanName(c1.getPlanName());
	}

	@Override
	public Boolean ExportPdf() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean ExportExcel() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
