package com.kh.whilesample;

public class While04 {

	public static void main(String[] args) {
		
		// 1���� 100���� �� ���ϱ�
		int num = 1;
		int sum = 0;
		
		while(num <= 100) {
			sum += num;
			num++;
		 	//System.out.println("sum�� : " + sum);
		 	//sum�� �հ踦 �ֱ������� ��������� while�� �ȿ� �ۼ��ϱ�
		}
		System.out.println("1~10������ ���� : " + sum);
		/*
		 while�� ����Ǿ����ؼ� Ŭ������ ����� ���� �ƴ�
		 while���� ����� �� �����ִ� System.out.println(sum)�� ��µ�
		*/
	}
}
