package com.bryant.mybatis.venda.service;

import java.util.List;

import com.bryant.mybatis.venda.model.Investment;

public interface InvestmentService {
	List<Investment> getInvestmentList();
	
	Investment getInvestment(String investmentid);
	
	void insert(Investment investment);
	
	void update(Investment investment);
	
	void delete(String investmentid);
}
