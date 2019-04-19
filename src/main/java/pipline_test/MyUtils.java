/**
 * 
 */
package pipline_test;

/**
 * @ClassName MyUtils
 *
 * @Description
 * 
 * @Author Dike
 *
 * @Date 2019年4月19日 上午10:18:45
 */
public class MyUtils {
	public double add(double num1, double num2) {
		return num1 + num2;
	}
	
	public double sub(double num1, double num2) {
		return num1 - num2;
	}
	
	public double mul(double num1, double num2) {
		return num1 * num2;
	}
	
	public double div(double num1, double num2) {
		if(num2 == 0) {
			System.out.println("num2 is not 0");
			return 0;
		}
		else {
			return num1 / num2;
		}
	}
}
