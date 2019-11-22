package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("kaa");
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

  @BeforeTest
  public void beforeTest() {
	  System.out.println("bef test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("aft test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("bef suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("aft suite");
  }

}
