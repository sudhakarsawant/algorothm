package Teatng;

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
  public void fhhuh() {
	  System.out.println("1 test");
  }
  @Test
  public void gkmkmkm() {
	  System.out.println("2 test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before m");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after m");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("bclass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("aftclass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("be test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("aft test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("befr suit");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("aft suit");
  }

}
