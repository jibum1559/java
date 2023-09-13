package com.kh.api.exam1;

public class WrapperMain {
/*
 Wrapper �⺻ ������ ������ ��ü�� ����(wrap)
 		 ��ü�� �۾��� �� ����
 		 Ŭ�����δ� Integer, Double, Boolean ���� ����
 */
	public static void main(String[] args) {
		Integer num = 40;
		System.out.println("������ : " + num);
		
		//Wrapper Ŭ������ �⺻ ������ �������� ��ȯ
		int intValue = num.intValue();
		System.out.println("�⺻ ������ ���� �� : " + intValue);
		
		double pi = 3.14159265359;
		
		//���� ���� ���
		
		double radius = 5.0;
		double area = pi * Math.pow(radius, 2);
		System.out.println("���� ���� : " + area);
		
		//���ڿ��� �Ǽ��� ��ȯ
		String numStr = "3.14";
		Double parseDouble = Double.parseDouble(numStr);
		//parseDouble String ���ڿ� �����͸� ����, �Ҽ��� ��ȯ�ϰڴ�
		System.out.println("���ڿ��� �Ǽ��� ��ȯ�� �� : " + parseDouble);
		
		//boolean Wrapper Ŭ���� �����
		Boolean isJavaFun = true;
		
		//���ǹ� Ȱ��
		if(isJavaFun) {
			System.out.println("�ڹٴ� ��ս��ϴ�.");
		} else {
			System.out.println("�ڹٴ� ��̾�����");
		}
		
		String boolStr = "trun";
		Boolean parsBool = Boolean.parseBoolean(boolStr);
		System.out.println("���ڿ��� �Ҹ������� ��ȯ�� �� : " + parsBool);
			
	}

}
