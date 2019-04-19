/**
 * 
 */
package pipline_test;

import org.junit.Assert;
import org.junit.Test;

/**
 * @ClassName MyUtilsTest
 *
 * @Description
 * 
 * @Author Dike
 *
 * @Date 2019年4月19日 上午10:25:03
 */
public class MyUtilsTest {
	private MyUtils myUtils = new MyUtils();
	
	@Test
	public void testAdd() {
		Assert.assertEquals(3, myUtils.add(1, 2), 0.00);
		
		Assert.assertEquals(15, myUtils.add(12, 3), 0.00);
	}
	
	@Test
	public void testSub() {
		Assert.assertEquals(1, myUtils.sub(16, 15), 0.00);
		
		Assert.assertEquals(6, myUtils.sub(26, 20), 0.00);
	}
	
	@Test
	public void testMul() {
		Assert.assertEquals(6, myUtils.mul(2, 3), 0.00);
	}
}
