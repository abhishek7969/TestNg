package com.javacodegeeks.testng.maven;

import org.testng.annotations.Test;
import org.testng.Assert;


public class TestNgMavenExample {

	@Test
	public void exampleOfTestNgMaven() {
		System.out.println("This is TestNG-Maven Example");
			Assert.assertEquals("Google", "Google");
	}
}
