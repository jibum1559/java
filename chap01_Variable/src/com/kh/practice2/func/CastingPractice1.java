package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {
	public static void main(String[] args) {
		//Ű����� ���� �ϳ��� �Է� �޾� �� ������ ���ڸ� ����ϼ���
		Scanner sc = new Scanner(System.in);
		
		/* 
	    System.out.print("���� : " );
		String chr;
		chr = sc.next();
		char chr2 = chr.charAt(0);
		
		System.out.print("A unicode : " + (int)chr2);
		*/
		
		System.out.print("���� : " );
		char inputChar = sc.next().charAt(0); //�Է¹��� ���� ���
		
		int changeChar = inputChar;
		System.out.print("�Է¹��� : " + inputChar + "�����ڵ� : " + changeChar);
		
	}
}
