package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	public static void main(String[] args) {
		//Ű����� ����, ���� ���� �Ǽ������� �Է� �޾�
		Scanner sc = new Scanner(System.in);
		
		double width, height;
		System.out.print("���α��� : ");
		width = sc.nextDouble();
		System.out.print("���α��� : ");
		height = sc.nextDouble();
		
		double area = width * height;
		double round = (width + height) * 2;
		
		System.out.println("���� : " + area);
		System.out.println("�ѷ� : " + round);
	}
}
