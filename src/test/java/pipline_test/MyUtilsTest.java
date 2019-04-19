package pipline_test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.junit.Assert;

import org.testng.annotations.AfterClass;

public class MyUtilsTest {
  private MyUtils myUtils = new MyUtils();
	
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @Test
  public void testAdd() {
	  Assert.assertEquals(3, myUtils.add(1, 2), 0.00);
	  
	  Assert.assertEquals(9, myUtils.add(3, 6), 0.00);
  }
  
  @Test
  public void testSub() {
	  Assert.assertEquals(1, myUtils.sub(3, 2), 0.00);
	  
	  Assert.assertEquals(6, myUtils.sub(26, 20), 0.00);
  }
  
  @Test
  public void testMul() {
	  Assert.assertEquals(6, myUtils.mul(3, 2), 0.00);
	  
	  Assert.assertEquals(2, myUtils.mul(1, 1), 0.00);
  }
}
