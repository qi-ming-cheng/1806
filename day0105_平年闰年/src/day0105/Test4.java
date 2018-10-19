package day0105;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		System.out.print("输入年号：");
		int y = new Scanner(System.in).nextInt();
		
		//把年号y的值传递到runNian()方法进行运算
		//再判断该方法的返回值是真是假
		boolean b = runNian(y);
		
		if(b) {
			System.out.println("闰年");
		} else {
			System.out.println("平年");
		}
	}
	
	static boolean runNian(int y) {
		//y能被4整除
		//if(y%4 == 0) {
		//	//能被4整除的情况下，再判断不能被100整除
		//	if(y%100 != 0) {
		//		//向调用位置返回结果，
		//		//跳回到调用位置执行
		//		return true;
		//	}
		//}		
		////y能被400整除
		//if(y%400 == 0) {
		//	return true;
		//}
		
		//能被4整除并且不能被100整除
		//或者能被400整除
		if((y%4==0 && y%100!=0) || y%400==0) {
			return true;
		}		
		
		//不是闰年，返回false
		return false;
	}
	
}







