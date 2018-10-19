package day0202;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("输入三个整数：");
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();
		int c = new Scanner(System.in).nextInt();   
		
		//a,b,c三个整数的值，
		//传递到max()方法，求最大值
		//得到方法的返回结果，保存到变量 m
		int m = max(a, b, c);
		System.out.println("最大值：" + m);
	}
	
	
	static int max(int a, int b, int c) {
		//求a,b的最大值保存到变量 max
		//求max,c的最大值，保存到 max
		//int max = a>b ? a : b; 
		//max = max>c ? max : c;
		
		int max = a>b ? (a>c?a:c) : (b>c?b:c);
		
		return max;
	}
	
	
}






