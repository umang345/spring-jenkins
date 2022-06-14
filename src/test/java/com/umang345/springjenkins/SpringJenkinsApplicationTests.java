package com.umang345.springjenkins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);

	@Test
	contextLoads()
	{
		logger.info("Test case executing...");
		logger.info("Test case executing second log statement...");
		Assertions.assertEquals(true, true);
	}

}
