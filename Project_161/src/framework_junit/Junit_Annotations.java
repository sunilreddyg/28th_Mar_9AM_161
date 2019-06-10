package framework_junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit_Annotations 
{

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		System.out.println("BeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		System.out.println("AfterClass");
	}

	@Before
	public void setUp() throws Exception 
	{
		System.out.println("BeforeMethod");
	}

	@After
	public void tearDown() throws Exception
	{
		System.out.println("Aftermethod");
	}

	@Test
	public void test()
	{
		System.out.println("test method executed");
	}
	
	@Test
	public void test1()
	{
		System.out.println("test1 method executed");
	}

}
