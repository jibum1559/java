package com.kh.ifSample;

public class IfElseIfSample {

	public static void main(String[] args) {
		// if-else if-else
		/*
		 ���� ���� ������ ���������� ��
		 �� �� ù ��° ���� ���ǿ� �ش��ϴ� �ڵ� ����� �����ϴ� ����
		 ���� if�� else if �� ���ǵ� ���� �ƴ϶�� ������ else ��� ����
		 
		 if (����1) {
		 	//����1�� ���� �� ����Ǵ��ڵ�
		} else if (����2) {
			//����2�� ���� �� ����Ǵ� �ڵ�
		} else {
			//���� ��� ������ ������ �� ����Ǵ� �ڵ�
		}
		 * */
		/*
		if (20��) {
			�ؿܿ��� ���ž�!
		} else if (���� 20�캸�� ���ٸ�) {
			�ؿܿ����� ���ž�
		} else {
			�� ���� �����ž�
		}
		*/
		int age = 19;
		if(age >= 20 && age < 33) {
			System.out.println("���� ������ ���ž�");
		} else if(age >= 33) {
			System.out.println("���� �౸ �ѹ� ���� ����");
		} else {
			System.out.println("������ ����...");
		}
		
		int month = 9;
		if (month == 12 || month == 1 || month == 2) {
			System.out.println("ũ���������� �ִ� �ܿ��̾�*^^*");
		} else if (month == 3 || month == 4 || month == 5) {
			System.out.println("���� ������ �ǰ� ���� ������~~!");
		} else if (month == 6 || month == 7 || month == 8) {
			System.out.println("�ÿ��� �����̸� �� �� �ִ� �����̴�!");
		} else
			System.out.println("���Ա� �� ���� ������ �����̾�>o<");
		
			
		
		
	}

}
