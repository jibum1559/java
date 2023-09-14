package com.kh.objExam;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PracticeMain4 {

	public void practice1() {

	}
	public void practice2() {
		//��¥ ���� ���
		Date currentDate = new Date();
		SimpleDateFormat smDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String formatStr = String.format("���� ��¥ : %s", smDateFormat.format(currentDate));
		System.out.println(formatStr);
	}
	
	public void practice3() {
		int num1 = 123;
		int num2 = 7;
		//���ڰ� ������ ���̺��� ª�� ��� �տ� 0���� ä���ְڴ�.
		//��µǴ� ������ �ּ� �ʺ� �ڸ� 5�ڸ� �ϰ�ʹ�.
		String formatInt = String.format("����1 : %05d, ����2 : %d",num1,num2);
		System.out.println(formatInt);
	}
	
	public void practice4() {
		String text1 = "Hello";
		String text2 = "World";
		//10�� �ּ� �ʺ�, �ּ� 10�ڸ��� ������ ����
		//���� ���ڿ���  10�ڸ����� ª�ٸ�  ���ʿ� �������� ä����
		//���� ���ڿ��� -10�ڸ����� ª�ٸ� �����ʿ� �������� ä����
		//' �ش� ����ǥ�� �ѷ��׾ƾ���
		String formatStr = String.format("'%-10s', '%10s'", text1, text2);
		System.out.println(formatStr);
	}

	public static void main(String[] args) {
		PracticeMain4 am = new PracticeMain4();
		am.practice2();
		am.practice3();
		am.practice4();
	}

}