package com.kh.operator;

public class Ternary {

	public static void main(String[] args) {
		// 6. ���� ������
		/*
		 ���� = ���� ? ���� : ����
		 ������ ���ϰ� �� ���� �� �� �ϳ��� ��ȯ��
		 ���� ? ��1       : ��2        ���·� ���
		 ���� ? ��1(=true): ��2(false)
		 �� 1�� ������ ���� �� ���
		 �� 2�� ������ ������ �� ���
		 
		int age = 20;
		String status = (age >= 20) ? "����" : "�̼�����";
		System.out.println(status);
		 
		 * */
		//ex) ���̰� 20�̻��� �����ΰ� �̼������ΰ�
		int age = 20;
		String status = (age >= 20 ? "����" : "�̼�����");
		System.out.println(status);
		
		int score = 40;
		String result = (score >= 70 ? "�հ�" : "���հ�");
		System.out.println(result);
		
		int number = -5;
		String sign = (-5 > 0) ? "true" : "false";
		System.out.println("sign : " + sign);
		
		int temperature = 17;
		String weather = (temperature > 25 ? "���� ����" : "������ ����");
		System.out.println(weather);
		
		// ���� 7�� ���� ¦������ Ȧ������ ��� 1 
		int num1 = 22;
		String result1 = (num1 % 2 == 0 ? "¦��" : "Ȧ��");
		System.out.println(result1);
		
		int num2 = 1;
		String result2 = (num2 > 0) ? "���" : (num2 < 0) ? "����" : "0";
		System.out.println(result2);
		
				
	}

}
