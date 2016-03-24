package com.bryant.mybatis.venda;

import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.bryant.mybatis.venda.mapper.InvestmentMapper;
import com.bryant.mybatis.venda.model.Investment;

public class TestInvestment {
	private static SqlSessionFactory sqlSessionFactory;
	
	@Before
	public void init() throws Exception {
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));
	}

	@Test
	public void testGetInvestmentList() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
//		List<Investment> list = sqlSession.selectList("test.getInvestmentList");
		InvestmentMapper mapper = sqlSession.getMapper(InvestmentMapper.class);
		List<Investment> list = mapper.getInvestmentList();
		for(Investment investment : list) {
			System.out.println(investment);
		}
		sqlSession.close();
	}

	@Test
	public void testGetInvestmentById() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
//		Investment investment = sqlSession.selectOne("test.getInvestmentById", "TZ1503031002247");
		InvestmentMapper mapper = sqlSession.getMapper(InvestmentMapper.class);
		Investment investment = mapper.getInvestmentById("TZ1503031002247");
			System.out.println(investment);
		sqlSession.close();
	}
	
	@Test
	public void testInsert() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		Investment investment = new Investment();
		investment.setInvestmentid("INVESTMENT001");
		investment.setTenderid("tenderid001");
//		int i = sqlSession.insert("test.insert", investment);
		
		InvestmentMapper mapper = sqlSession.getMapper(InvestmentMapper.class);
		int i = mapper.insert(investment);
		
		System.out.println(i);
		
		sqlSession.commit();
		sqlSession.close();
	}
	
	@Test
	public void testUpdate() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		Investment investment = new Investment();
		investment.setInvestmentid("INVESTMENT001");
		investment.setTenderid("tenderid002");
//		int i = sqlSession.insert("test.update", investment);
		
		InvestmentMapper mapper = sqlSession.getMapper(InvestmentMapper.class);
		int i = mapper.update(investment);
		System.out.println(i);
		
		sqlSession.commit();
		sqlSession.close();
	}
	
	@Test
	public void testDelete() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
//		int i = sqlSession.insert("test.delete", "INVESTMENT001");
		InvestmentMapper mapper = sqlSession.getMapper(InvestmentMapper.class);
		int i = mapper.delete("INVESTMENT001");
		System.out.println(i);
		
		sqlSession.commit();
		sqlSession.close();
	}
	
}
