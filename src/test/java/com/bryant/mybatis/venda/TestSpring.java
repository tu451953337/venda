package com.bryant.mybatis.venda;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bryant.mybatis.venda.mapper.InvestmentMapper;
import com.bryant.mybatis.venda.model.Investment;
import com.bryant.mybatis.venda.service.InvestmentService;

public class TestSpring {
	private SqlSessionFactory sqlSessionFactory;
	private ApplicationContext appContext;
	
	@Before
	public void init() {
		appContext = new ClassPathXmlApplicationContext("classpath:spring/spring-mybatis.xml");
		sqlSessionFactory = appContext.getBean("sqlSessionFactory", SqlSessionFactory.class); 
	}
	
	@Test
	public void testSpring() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		System.out.println(sqlSession);
	}
	
	@Test
	public void testGetInvestmentList() {
		InvestmentService investmentService = appContext.getBean("investmentService", InvestmentService.class);
		List<Investment> list = investmentService.getInvestmentList();
		for(Investment investment : list) {
			System.out.println(investment);
		}
	}
	
	@Test
	public void testInsert() {
		Investment investment = new Investment();
		investment.setInvestmentid("INVESTMENT002");
		investment.setTenderid("tenderid001");
		
		InvestmentService investmentService = appContext.getBean("investmentService", InvestmentService.class);
		investmentService.insert(investment);
		
	}
	
	@Test
	public void testDelete() {
		InvestmentService investmentService = appContext.getBean("investmentService", InvestmentService.class);
		investmentService.delete("INVESTMENT002");
	}
	
	@After
	public void close() {
		System.out.println("close");
	}
}
