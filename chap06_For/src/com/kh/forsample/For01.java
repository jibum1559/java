package com.kh.forsample;

public class For01 {

	public static void main(String[] args) {
		/*
		 for���� ���α׷��ֿ��� �ݺ� �۾��� �����ϱ� ���� ���Ǵ� �����
		 Ư���� ������ �����ϴ� ���� �ڵ� ����� �ݺ� �����ϴµ� ���
		 ��κ��� ���α׷��� ���� for���� ���� ����
		 for (�ʱ�ȭ; ���ǽ�; ������) {
		 	//������ ���� ��� �ݺ������� ������ �ڵ�
		 }
		 �ʱ�ȭ : �ݺ����� ���۵� �� �� ���� ����Ǵ� �κ�����, �ݺ� ������ �ʱ�ȭ�ϴ� ������ �Ѵ�.
		 ���ǽ� : �ݺ����� ����� ������ �˻��ϴ� �κ����� ������ ���� ��쿡�� �ݺ��ڵ� ��� ���� �� ����
		 ������ : �ݺ� ������ ������Ű�ų� ���ҽ�Ű�� �κ�����, �ݺ� �ڵ� ��� ���� �� ���� 
		*/
		
		/*
		for (int i = 1; i <= 5; i++) {
			//���� i<=5 ���� ��쿡 ����Ǵ� ����
			System.out.println(i);
		}
		
		for (int i = 0; i <= 5; i++) {
			System.out.println("i�� �� : " + i);
		}
		
		for (int i = 2; i <= 7; i++) {
			System.out.println("i : " + i);
		}
		
		for (int i = 10; i >= 5; i--) {
			System.out.println("i�� �� : " + i);
		}		
		*/
		
		//sum�� ���� 3~5������ ������ ����ϱ�
		
		/*
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			//��
			sum += i;
		}		
		System.out.println("1���� 10������ �� : " + sum);
		
		int sum1 = 0;
		for(int i = 3 ; i <= 5 ; i++) {
			sum1 += i;
		}
		System.out.println("3���� 5������ �� : " + sum1);
		
		
		int sum1 = 0;
		for (int i = 1; i <= 5; i++) {
			sum1 += i;
			System.out.println("1~5������ �� : " + sum1);
		}
		*/
		int sum2 = 10;	//9	//10 -1
		for(int i = 5; i >= 2; i--) {
			sum2 -= i;
			System.out.println("sum2 - : " + sum2);
		}
		
		
		
		int mul2; 
		for(int num = 1; num <= 9; num++) {
			mul2 = 2 * num;
			
			System.out.println("2�� : " + mul2);
		}
		System.out.println();
		
		int mul9;
		for(int num9 = 1; num9 <= 9; num9++) {
			mul9 = 9 * num9;
			System.out.println("9�� : " + mul9);
		}
		
	}

}
