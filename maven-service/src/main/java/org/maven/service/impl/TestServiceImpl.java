package org.maven.service.impl;

import java.util.List;

import org.maven.bean.TestMavenBean;
import org.maven.dao.TestDaoI;
import org.maven.service.TestServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description: TODO
 *
 * @author luck
 *
 * @date 2017年3月20日 下午7:46:37
 */
@Service
public class TestServiceImpl implements TestServiceI {
	
	@Autowired
	private TestDaoI tdi;

	public List<TestMavenBean> testService() {
		return tdi.testDaoMethod();
	}

}
