package org.maven.dao.impl;

import java.util.List;

import org.maven.bean.TestMavenBean;
import org.maven.dao.TestDaoI;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

/**
 * @Description: TODO
 *
 * @author luck
 *
 * @date 2017年3月20日 下午8:39:11
 */
@Repository
public class TestDaoImpl extends SqlSessionDaoSupport implements TestDaoI {


	public List<TestMavenBean> testDaoMethod() {
		List<TestMavenBean> testMavens =  this.getSqlSession().selectList("testMaven.SeletTestMavenBean", new TestMavenBean());
		return testMavens;
	}



}
