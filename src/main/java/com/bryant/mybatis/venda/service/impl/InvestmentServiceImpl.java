package com.bryant.mybatis.venda.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.bryant.mybatis.venda.mapper.InvestmentMapper;
import com.bryant.mybatis.venda.model.Investment;
import com.bryant.mybatis.venda.service.InvestmentService;

public class InvestmentServiceImpl extends SqlSessionDaoSupport implements InvestmentService {

	@Override
	public List<Investment> getInvestmentList() {
		SqlSession sqlSession = this.getSqlSession();
		InvestmentMapper mapper = sqlSession.getMapper(InvestmentMapper.class);
		return mapper.getInvestmentList();
	}

	@Override
	public Investment getInvestment(String investmentid) {
		SqlSession sqlSession = this.getSqlSession();
		InvestmentMapper mapper = sqlSession.getMapper(InvestmentMapper.class);
		return mapper.getInvestmentById(investmentid);
	}

	@Override
	public void insert(Investment investment) {
		SqlSession sqlSession = this.getSqlSession();
		InvestmentMapper mapper = sqlSession.getMapper(InvestmentMapper.class);
		mapper.insert(investment);
		
		Investment updateInvestment = new Investment();
		updateInvestment.setInvestmentid("TZ1503031002247");
		updateInvestment.setTenderid("XMAAA");
		mapper.update(updateInvestment);
		
		"".substring(5);
		
	}

	@Override
	public void update(Investment investment) {
		SqlSession sqlSession = this.getSqlSession();
		InvestmentMapper mapper = sqlSession.getMapper(InvestmentMapper.class);
		mapper.update(investment);
		
	}

	@Override
	public void delete(String investmentid) {
		SqlSession sqlSession = this.getSqlSession();
		InvestmentMapper mapper = sqlSession.getMapper(InvestmentMapper.class);
		mapper.delete(investmentid);
		
	}
	
}
