package com.bryant.mybatis.venda.mapper;

import java.util.List;

import com.bryant.mybatis.venda.model.Investment;

public interface InvestmentMapper {
	List<Investment> getInvestmentList();
	
	Investment getInvestmentById(String investmentid);
	
	int insert(Investment investment);
	
	int update(Investment investment);

	int delete(String investmentid);
}
