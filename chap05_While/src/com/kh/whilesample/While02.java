package com.kh.whilesample;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		int month;
		boolean choice = false;
		while(!choice) {
		System.out.print("���ڸ� �Է����ּ���. : ");
		month = sc.nextInt();
		
		switch(month) {
			case 12 : case 1 : case 2 :
				System.out.println("�ܿ� �Դϴ�.");
				choice = true;
				break;
			case 3 : case 4 : case 5 :
				System.out.println("�� �Դϴ�.");
				choice = true;
				break;
			case 6 : case 7 : case 8 :
				System.out.println("���� �Դϴ�.");
				choice = true;
				break;
			case 9 : case 10 : case 11 :
				System.out.println("���� �Դϴ�.");
				choice = true;
				break;
			default:
				System.out.println("�ٽ� �������ּ���.");
			}
		} */
		
		/*
		 ���̰����� �����ϴµ� 9�� �̻� Ƽ���� ������ �� �ֱ� ����
		 ���̸� �Է¹޾� ����(19~20) û�ҳ�(14~18) ���(10~13)�� �з��ϰ� ����ϱ�
		 while switch case �̿��ؼ� ����ϱ�
		 �̿� ���̴� �ٽ� �Է��ϼ���. �����.
		 */
		
		int age;
		boolean result = false;
		while(!result) {
			System.out.print("�ȳ��ϼ���. �Ե����� �Դϴ�. ���̸� �Է����ּ���. : ");
			age = sc.nextInt();

			switch(age) {
				case 19 : case 20 :
					System.out.println("���� �Դϴ�.");
					result = true;
					break;
				case 14 : case 15 : case 16 : case 17 : case 18 :
					System.out.println("û�ҳ� �Դϴ�.");
					result = true;
					break;
				case 10 : case 11 : case 12 : case 13 :
					System.out.println("��� �Դϴ�.");
					result = true;
					break;
				default :
					System.out.println("�ٽ� �Է����ּ���.");
				
			}
		}
		
	}
		
}
