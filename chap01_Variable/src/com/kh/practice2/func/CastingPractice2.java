package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {
	public static void main(String[] args) {
		//�Ǽ���(�Ҽ���)���� ����, ����, ���� �� ������ ������ �Է� �޾� ������ ����� ����ϼ���.
		//�� �� ������ ����� ���������� ó���ϼ���.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		double num1 = sc.nextDouble();
		System.out.print("���� : ");
		double num2 = sc.nextDouble();
		System.out.print("���� : ");
		double num3 = sc.nextDouble();
		
		System.out.println("���� : " + (int)(num1+num2+num3));
		System.out.println("��� : " + (int)(num1+num2+num3)/3);
		
		/* int averageScore = (int)(num1 + num2 + num3);
		int totalScore = (averageScore / 3);
		System.out.print("�������� : "); 
		*/
		
	}
}
