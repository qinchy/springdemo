package com.qinchy;

import com.qinchy.springdemo.service.Greeting;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ImportResource(locations = {"classpath:spring-dubbo-consumer.xml"})
public class SpringdemoBizApplicationTests {

	@Autowired
	private Greeting greeting;

	@Test
	public void contextLoads() {
		String str = greeting.greeting("qinchy");
		System.out.println("########"+str);
	}

}
