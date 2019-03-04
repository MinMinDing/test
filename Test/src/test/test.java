package test;
/**
 * 个计算圆面积的Jav
 */
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		double a , c;
		double b = 3.14;
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入圆半径");
		a = scanner.nextDouble();
		c = a*a*b;
		System.out.println("圆的面积为："+c);

	}

}
