package day0105;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		System.out.print("������ţ�");
		int y = new Scanner(System.in).nextInt();
		
		//�����y��ֵ���ݵ�runNian()������������
		//���жϸ÷����ķ���ֵ�����Ǽ�
		boolean b = runNian(y);
		
		if(b) {
			System.out.println("����");
		} else {
			System.out.println("ƽ��");
		}
	}
	
	static boolean runNian(int y) {
		//y�ܱ�4����
		//if(y%4 == 0) {
		//	//�ܱ�4����������£����жϲ��ܱ�100����
		//	if(y%100 != 0) {
		//		//�����λ�÷��ؽ����
		//		//���ص�����λ��ִ��
		//		return true;
		//	}
		//}		
		////y�ܱ�400����
		//if(y%400 == 0) {
		//	return true;
		//}
		
		//�ܱ�4�������Ҳ��ܱ�100����
		//�����ܱ�400����
		if((y%4==0 && y%100!=0) || y%400==0) {
			return true;
		}		
		
		//�������꣬����false
		return false;
	}
	
}







