package com.kh.forsample;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		
		//������ �����
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.println("ù��° ���ڸ� �Է��ϼ���.");
		int num1 = sc.nextInt(); //2
		
		System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
		int num2 = sc.nextInt(); //4
		
		int result = 0; //���� ���� 0���� �ݴϴ�. 
		for (int i = 1; i <= num2; i++) {
			result += num1;
			System.out.println(num1 + " * " + i + " = " + result);
		
		}
		*/
		//2~9�ܱ��� �������� ����ϱ�
		int dan = sc.nextInt();
		int result;
		for(int mul = dan; mul <= 9; mul++) {
			for(int num = 1; num <= 9; num++) {
				result = mul * num;
				System.out.println(mul + " * " + num + " = " + result);				
			}
			System.out.println();
		}
		
	}

}
