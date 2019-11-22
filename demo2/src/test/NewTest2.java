package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest2 {
  @Test
  public void f() {
	  System.out.println("hi");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("bef met");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("aft met");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("bef cls");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("aft cls");
  }
}
