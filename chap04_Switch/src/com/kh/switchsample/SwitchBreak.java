package com.kh.switchsample;

import java.util.Scanner;

public class SwitchBreak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 ����ڷκ��� ������ �Է¹޾� ������ 90�̻��̸� 'A', 90�̸� 80�̻��̸� 'B', 
		 80�̸� 70�̻��̸� 'C', 70�̸� 60�̻��̸� 'D', �� �̸��̸� 'F'�� ����ϴ� Code�� �ۼ��϶�.
		*/
		
		System.out.println("������ �Է��ϸ� ������ ����մϴ�.");
		int score = sc.nextInt();
		String grade;
		switch(score/10) {
			case 9 : case 10 : 
				grade="A";
				break;
			case 8 : 
				grade="B";
				break;
			case 7 : 
				grade="C";
				break;
			case 6 : 
				grade="D";
				break;
			default :
				grade="F";
		}
		System.out.println("����� ������ " + grade + " ���� �Դϴ�.");
		
	}

}
