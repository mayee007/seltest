package com.mine.seltest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SeltestApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Test 
	public void test1() { 
		System.out.println("inside test1");
	}
	
	@Test 
	public void test2() { 
		System.out.println("inside test2");
	}

}
