package com.kh.switchsample;

import java.util.Scanner;

public class SwitchScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �������ּ��� : ");
		int num;
		num = sc.nextInt();
		switch(num) {
			case 1:
				System.out.println("���");
				break;
			case 2:
				System.out.println("��");
				break;
			case 3:
				System.out.println("����");
				break;
			default:
				System.out.println("�ٽ� �������ּ���.");
		}
		//scanner �� �̿��ؼ� ���ڸ� �����ϴ� switch �� �ϳ� ������ּ���.
		
		System.out.println("���ϴ� ������ ��ȣ�� �Է����ּ���.");
		System.out.println("1.����Ĩ 2.������ 3.��īĨ");
		int snack = sc.nextInt();
		switch(snack) {
			case 1:
				System.out.println("����Ĩ �帱�Կ�.");
				break;
			case 2:
				System.out.println("������ �帱�Կ�.");
				break;
			case 3:
				System.out.println("��īĨ �帱�Կ�.");
				break;
			default:
				System.out.println("�ٽ� ����ּ���.");
		}
		
		System.out.println("�ֹ��Ͻ� ��ȣ�� �������ּ���.");
		System.out.print("1. �Ƹ޸�ī��");
		System.out.print(" 2. ������Ƽ");
		System.out.println(" 3. ���ν����");
		
		int choice = sc.nextInt();
		
		switch (choice) {
			case 1:
				System.out.println("�Ƹ޸�ī�� �ֹ��ϼ̽��ϴ�.");
				break;
			case 2:
				System.out.println("������Ƽ �ֹ��ϼ̽��ϴ�.");
				break;
			case 3:
				System.out.println("���ν���� �ֹ��ϼ̽��ϴ�.");
				break;
		default :
				System.out.println("�߸��� �����Դϴ�. �ٽ� �ֹ����ּ���.");
		}

	}

}
