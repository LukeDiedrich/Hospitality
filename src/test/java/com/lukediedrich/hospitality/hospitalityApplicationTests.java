package com.lukediedrich.hospitality;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class hospitalityApplicationTests
{

	private static final String SERVICE_URL
	= "http://services.groupkt.com/state/get/USA/all";

	@Test
	public void contextLoads() {
	}

}
