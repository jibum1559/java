package com.kh.practice1.func;

import java.util.Scanner;
 
public class VariablePractice1 {
	public static void main(String[] args) {
	//�̸�, ����, ����, Ű�� ����ڿ��� �Է� �޾� ������ ���� ������ ��� ����ϼ���.
	Scanner sc = new Scanner(System.in);
	
	String name;
	System.out.print("�̸��� �Է��ϼ���. : ");
	name = sc.next();
	
	String sex;
	System.out.print("������ �Է��ϼ���(��/��). : ");
	sex = sc.next();
	
	int age;
	System.out.print("���̸� �Է��ϼ���. : ");
	age = sc.nextInt();
	
	double height;
	System.out.print("Ű�� �Է��ϼ���(cm). : ");
	height = sc.nextDouble();
	
	System.out.print("Ű " + height + "cm�� " + age + "�� " + sex + "�� " + name + "�� �ݰ����ϴ�^^");
	

		
	}
}
