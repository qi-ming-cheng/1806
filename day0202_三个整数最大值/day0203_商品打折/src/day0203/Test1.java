package day0203;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("输入原价：");
		double p =
		 new Scanner(System.in).nextDouble();   
		
		//原价p的值，传递到discount()方法
		//来计算折扣价，
		//得到方法的返回值，保存到变量 p
		p = discount(p);
		System.out.println("最终价格："+p);
	}
	
	static double discount(double p) {
		//定义折扣率变量 r   1, 0.95, 0.9, 0.xx
		double r = 1;
		//根据原价参数p的范围，
		//来为r赋不同的值
				
		if(p >= 5000) {
			r = 0.75;
		} else if(p >= 3000) {
			r = 0.8;
		} else if(p >= 1000) {
			r = 0.9;
		} else if(p >= 500) {
			r = 0.95;
		}
		
		//计算折扣价，并返回
		return p*r;
	}
	
	
}








