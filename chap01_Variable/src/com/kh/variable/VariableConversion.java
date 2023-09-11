package com.kh.variable;

import java.util.Iterator;

public class VariableConversion {

	public static void main(String[] args) {
		//1. �ڵ�����ȯ(�Ͻ�������ȯ, ����������ȯ)
		int intNum = 110;
		System.out.println(intNum);
		int longNum = intNum;
		System.out.println(longNum);
		
		float floatNum = 3.14f;
		double doubleNum = floatNum;
		System.out.println(doubleNum);
		
		// int -> long �����ϴ� ����ȯ 2���� ����� ����ϱ�
		int intNum1 = 5200;
		int longNum1 = intNum1;
		int intNum2 = -1200;
		int longNum2 = intNum2;
		System.out.println("longNum1 : " + longNum1);
		System.out.println("longNum2 : " + longNum2);
		//short-> int �����ϴ� ����ȯ 1���� ����� ����ϱ�
		short shortNum1 = 500;
		System.out.print("shortNum : ");
		System.out.println(shortNum1);
		int intNum5 = shortNum1;
		System.out.println(intNum5);
		//float -> double �����ϴ� ����ȯ 1���� ����� ����ϱ�
		float floatNum2 = 3.14f;
		System.out.println(floatNum2);
		double doubleNum2 = floatNum2;
		System.out.println(doubleNum2);
		
		//2. ����� ����ȯ(���� ����ȯ)
		
		//long -> int
		long largeLong = 192333333344449L;
		int largeInt = (int)largeLong;
		System.out.println(largeInt);
	
		double largeDouble1 = 12345.6789;
		int intPart = (int) largeDouble1;
		System.out.println(intPart); //�Ǽ��� int�� ���� ����ȯ �� �� (���� �κи� �����ȴ�.)
		
		char chr = 'A';
		int intChr = chr;
		System.out.println(intChr);
		
		char charValue2 = 'B';
		int intValue2 = charValue2;
		System.out.println(intValue2);
		
		char charValue3 = 'C';
		int intValue3 = charValue3;
		System.out.println(intValue3);
		
		char charValue4 = 'D';
		int intValue4 = charValue4;
		System.out.println(intValue4);
		
		char charValue5 = 'E';
		int intValue5 = charValue5;
		System.out.println(intValue5);
		
		// double -> int�� ����ȯ  1�� ���
		
		//int�� short�� ����ȯ 1�� ���		
		
		double doubleNum3 = 3325.113345;
		int intNum3 = (int)doubleNum3;
		System.out.println(intNum3);
		
		int intNum4 = 20020404;
		short shortNum2 = (short) intNum4;
		System.out.println(shortNum2);
		
	}

}
