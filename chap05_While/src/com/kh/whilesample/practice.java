package com.kh.whilesample;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù ��° ���ڸ� �Է����ּ���.");
		int num1 = sc.nextInt();
		
		System.out.println("�� ��° ���ڸ� �Է����ּ���.");
		int num2 = sc.nextInt();
		
		int result = 0;
		
			for(int i = 1; i <= num2; i++) {
				result = num1 * i;
					System.out.println(num1 + (" * ") + i + (" = ") + result);
		
		}
	}

}
