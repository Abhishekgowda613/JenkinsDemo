package Demo_TestNG.Demo_TestNg;

import org.testng.annotations.*;

public class annotations {
	
    @BeforeSuite
	public void m1() {
		System.out.println("m1 @BeforeSuite");
	}
    @AfterSuite
    public void m2() {
		System.out.println("m2 @AfterSuite");
	}
    @BeforeClass
    public void m3() {
		System.out.println("m3 @BeforeClass");
	}
    @AfterClass
    public void m4() {
		System.out.println("m4 @AfterClass");
	}
    @BeforeGroups
    public void m5() {
		System.out.println("m5 @BeforeGroups");
	}
    @AfterGroups
    public void m6() {
		System.out.println("m6 @AfterGroups");
	}
    @BeforeTest
    public void m7() {
		System.out.println("m7 @BeforeTest");
	}
    @AfterTest
    public void m8() {
		System.out.println("m8 @AfterTest");
	}
    @BeforeMethod
    public void m9() {
		System.out.println("m9 @BeforeMethod");
	}
    @AfterMethod
    public void m10() {
		System.out.println("m10 @AfterMethod");
	}
    @Test
    public void m11() {
		System.out.println("m11 @Test");
	}
    
}
