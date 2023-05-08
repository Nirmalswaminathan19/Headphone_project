package com.loan.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.model.LoanApplicationModel;
import com.loan.repository.LoanApplicationRepository;

@Service
public class LoanApplicationService {
	@Autowired
	LoanApplicationRepository lr;

	public List<LoanApplicationModel> getall() {
		return lr.findAll();
	}

	public LoanApplicationModel saveDetail(LoanApplicationModel s) {
		return lr.save(s);
	}

	public LoanApplicationModel updateDetail(LoanApplicationModel s) {
		return lr.save(s);
	}

	public void deleteDetail(int loanid) {
		lr.deleteById(loanid);
		
	}

	public Optional<LoanApplicationModel> findloanId(int loanid) {
		return lr.findById(loanid);
	}
	

}
