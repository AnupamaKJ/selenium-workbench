package com.selenium.learning.Inheritance;

import org.testng.annotations.Test;

public class ChildClass extends ParentClass  {
	
	@Test
	public void testRunExtends()
	{
		doThis();
		ResuableMethods ps2 = new ResuableMethods(3); //Parameterized Constructor
		System.out.println(ps2.increment());
		System.out.println(ps2.decrement());
	
		System.out.println(ps2.multipleTwo());
		System.out.println(ps2.multipleThree());
	}

}
