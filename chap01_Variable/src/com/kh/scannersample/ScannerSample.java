package com.kh.scannersample;

import java.util.Scanner;

public class ScannerSample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̸� �Է��� �ּ���. : ");
		int age = sc.nextInt(); //������ �޴� next

		System.out.print("�̸��� �Է����ּ���. : ");
		String name, phoneNumber;
		name = sc.next();
		System.out.print("�ڵ��� ��ȣ�� �Է����ּ���. : ");
		phoneNumber = sc.next();

		System.out.println("���� ���̴� " + age + "�� �Դϴ�.");
		System.out.println("�̸��� " + name + "�̰�, �ڵ��� ��ȣ�� " + phoneNumber + " �Դϴ�.");
		System.out.println("�����ϰ� ������ ���� ������ �����ּ���^^*");
		System.out.println();
		
		//�� ��̿� ���� �����ϴ� ���İ� �� �ּ� 1�� ����ϱ�
		System.out.println("������ �������ּ���.");
		System.out.print("��� : ");
		String habby = sc.next();
		System.out.print("�����ϴ� ���� : ");
		String food = sc.next();
		System.out.print("�ּ� : ");
		String address = sc.next();
		
		
		
	}

}
