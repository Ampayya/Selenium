package com.TestNG;

import org.testng.annotations.Test;

public class Annotations1 {
	
	@Test(priority=1)
	public void applictionslaunch()
	{
		System.out.println("gmail applictaion launch successfully"); 
	}
	@Test(priority=0)
	public void inbox()
	{
		System.out.println("gmail application inbox functionality test successful");
	}

}
