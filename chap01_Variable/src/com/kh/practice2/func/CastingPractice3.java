package com.kh.practice2.func;

public class CastingPractice3 {
	public static void main(String[] args) {
		//���� �� �ʱ�ȭ�� 5���� ������ ������ �˸��� ��Ģ����(+, -, *, /)�� ����ȯ�� �̿��Ͽ�
		//�ּ��� ���� ���� ���� ���� �������� �ڵ带 �ۼ��ϼ���.
		
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println(iNum1 / iNum2); // 2
		System.out.println((int)dNum); // 2
		
		System.out.println((double)iNum2 * dNum); // 10.0
		System.out.println((double)iNum1); // 10.0
		
		System.out.println((double)iNum1 / (double)iNum2); // 2.5
		System.out.println((float)dNum); // 2.5
		
		System.out.println((int)fNum); // 2.5
		System.out.println((int)(iNum1/fNum)); // 2.5
		
		System.out.println(iNum1/fNum);
		System.out.println((double)iNum1/fNum);
		
		System.out.println(ch);
		System.out.println((int)ch);
		System.out.println((int)ch + iNum1);
		System.out.println((char)(ch + iNum1));
		
	}
}
