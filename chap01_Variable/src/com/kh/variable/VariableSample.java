package com.kh.variable;

public class VariableSample {

	public static void main(String[] args) {

		String name;
		name = "����";
		
		int hour = 15;
		double score = 90.5;
		char grade = 'A';
		
		System.out.println("�ȳ��ϼ���." + name + "�Դϴ�. ���� "+ hour +"�ÿ� ��۵˴ϴ�.");
		System.out.println("���� ������ " + score + " �Դϴ�.");
		System.out.println(score + " �� ���� " + grade + " �Դϴ�.");
		
		//������ �̸��� ���̿� �ڽ��� ���� (double)�� �ֱ�.
		/*
		 -�̸� String
		 ���� int
		 ���� double
		 char�� �̿��� ��� �����ϰ� ����ϱ� ~ 25�б���
		 * */
		
		String myName = "��¹�";
		int age = 35;
		double score2 = 98.2;
		char grade2 = 'A';
		System.out.println("�ȳ��ϼ���. " + myName + "�Դϴ�.");
		System.out.println("���� ���̴� " + age + "�� �Դϴ�.");
		System.out.println("���� �б� �ٴ� �� �޾Ҵ� ���� ������ " + score2 + "�� �̰�, ");
		System.out.println("����� " + grade2 + " ��� �Դϴ�. �����մϴ�.");
		
		
		
	}

}
