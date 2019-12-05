package com.hcl.junit;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestData {
	static Data data;
	@BeforeClass
	public static void setUp(){
		data=new Data();
	}
	@Test
	public void testDiv(){
		assertEquals(1,data.div(5, 4));
	}
	@Test(expected=ArithmeticException.class)
	public void testDivEx(){
		data.div(5, 0);
	}
	
	@Test
	public void testGetPropertyTest(){
		Data objData=new Data();
		assertNotNull(objData.getProperty("bhargav"));
		assertNull(objData.getProperty("tushar"));
	}
	
	@Test
	public void testEven(){
		Data objData=new Data();
		assertTrue(objData.even(10));
		assertFalse(objData.even(11));
	}
	@Test
	public void testMinarray(){
		int[] arr={-3,1,5,3,6};
		Data objData=new Data();
		assertEquals(-3, objData.minArray(arr) );
	}
	
	@Test
	public void testMax3(){
		assertEquals(5, data.max3(5, 2, 3));
		assertEquals(5, data.max3(2, 5, 3));
		assertEquals(5, data.max3(2, 3, 5));
		
		
	}
	@Test
	public void testsum(){
		assertEquals(5, data.sum(2,3));
	}

	@Test
	public void testSayHello() {
		Data data=new Data();
		assertEquals("welcome to junit...",data.sayHello());
	}
	
	@AfterClass
	
	public static void tearDown(){
		data=null;
	}

}
