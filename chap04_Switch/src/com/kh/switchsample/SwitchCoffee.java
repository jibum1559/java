package com.kh.switchsample;

import java.util.Scanner;

public class SwitchCoffee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// while���� Ȱ���� switch
		
		boolean isChoice = false;
		while(!isChoice) {
		System.out.println("Ŀ�Ǹ� �ֹ����ּ���.");
		System.out.println("1.���̽� �Ƹ޸�ī�� 2.�ξ� ��ũƼ 3.�ڸ� ��� ��Ƽ");
		int coffeNum = sc.nextInt();
			switch(coffeNum) {
				case 1:
					System.out.println("���̽� �Ƹ޸�ī�� �ֹ� �޾ҽ��ϴ�.");
					isChoice = true;
					break;
				case 2:
					System.out.println("�ξ� ��ũƼ �ֹ��޾ҽ��ϴ�.");
					isChoice = true;
					break;
				case 3:
					System.out.println("�ڸ� ��� ��Ƽ �ֹ��޾ҽ��ϴ�.");
					isChoice = true;
					break;
				default:
					System.out.println("�߸� �ֹ��ϼ̽��ϴ�. �ֹ���ȣ�� �ٽ� �����ּ���.");
					
			}
		}
		
	}

}
