package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {
	public static void main(String[] agrs) {
		//���� ���ڿ� ���� Ű����� �Է� �޾� ���ڿ��� �տ��� �� ���� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String s = sc.next();
		
		char a = s.charAt(0); //���ڸ� 1�ھ� ����. ���ڸ��� ���� ������ apple�� 1�ڰ� �ѱ� ������ ����� �� �� ����
		                      //�ڸ� ��ġ ���ؼ� ����ϱ�. �׷��� 0�� �Է��Ͽ� apple�� a�� ��µ�
							  //���� indexNum �̶���ؼ� �ڸ� ��ġ�� ǥ���Ѵ�.
		System.out.println("index 0�� ° �ڸ� : " + a);
		
		char p = s.charAt(1);
		System.out.println("index 1�� ° �ڸ� : " + p);
		
		String p2 = s.substring(2,3);
		System.out.println("index 2�� ° �ڸ� : " + p2);// ���ڸ��� �ƴ϶� �ڸ��� �����ؼ� ����� �� ����
													 // ���۸� �����ص� �ǰ�, ���� �����ص� ��.
		 											 // �ڸ� ��ġ ���ؼ� ����ϱ�
		 										     // ���۸� �ۼ��� ��� ������ �ε��� ��ġ���� ������ ��µȴ�.
													 // 2,3
		
		/*
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String s;
		s = sc.next();
		
		char a1 = s.charAt(0);
		System.out.println("ù ��° ���� : " + a1);
		
		char a2 = s.charAt(1);
		System.out.println("�� ��° ���� : " + a2);
		
		char a3 = s.charAt(2);
		System.out.println("�� ��° ���� : " + a3);
		*/
		
		
		
	}
}
