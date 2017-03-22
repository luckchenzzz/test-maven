package org.maven.controcller;

import java.util.List;

import org.maven.bean.TestMavenBean;
import org.maven.service.TestServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description: TODO
 *
 * @author luck
 *
 * @date 2017年3月20日 下午4:56:12
 */

@Controller
@RequestMapping("testControcller")
public class TestControcller {
	
	@Autowired
	private TestServiceI tsi;

	@RequestMapping("getTestMethod.do")
	@ResponseBody
	private String testMethod(){
		List<TestMavenBean> TestMavenBeans = tsi.testService();
		return TestMavenBeans.toString();
	}
}
