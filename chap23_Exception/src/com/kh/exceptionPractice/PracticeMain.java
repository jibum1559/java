package com.kh.exceptionPractice;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain am = new PracticeMain();
//		am.ArithException();
//		am.NPException();
//		am.NumFormatException();

		
	}
	public void ArithException() {
		// int dividend / divisor �������� �� ����ó��
		int dividend = 100;
		int divisor = 0;
		try {
			int result = (dividend / divisor);
			System.out.println("�������� �� : " + result);
		} catch(ArithmeticException e1) {
			System.out.println("��� �������� ���� ���� �߻�!");
			System.out.println("ArithmeticException ���� �߻� : " + e1.getMessage());
		}
	}
	
	public void NPException() {
		String text = "Hello World";
		String subText = null;
		//int length = text.length(); //Hello world ���� ���
		
		try {
			//indexOf�� subText �ȿ� �ִ� null ���� ������ ���ڿ� �˻�
			int length = text.indexOf(subText);
		} catch(NullPointerException e2) {
			System.out.println("NullPointerException ���� �߻� : " + e2.getMessage());
		}
		
	}
	
	public void NumFormatException() {
		try {
			String text = "123.45";
			int number = Integer.parseInt(text);
			//�������� ������ ���ڿ��� ������ ��ȯ
			System.out.println(number);
		} catch(NumberFormatException e3) {
			System.out.println("���������� ���� ���� �߻� : " + e3.getMessage());
			System.out.println("���������� �Է����ּ���.");
		}
	}

	
}
