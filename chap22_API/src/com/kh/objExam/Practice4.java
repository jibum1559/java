package com.kh.objExam;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Practice4 {

	public static void main(String[] args) {
		Practice4 am = new Practice4();
		am.practice1();
		am.practice2();
		am.practice3();
		am.practice4();
		am.practice5();
		
	}
	public void practice1() { //����� yyyy-MM-dd
		SimpleDateFormat abc = new SimpleDateFormat("yyyy�� MM�� dd��");
		Date currentDate = new Date();
		String abcDate = abc.format(currentDate);
		System.out.println("����� : " + abcDate);
	}
	public void practice2() { //�ú��� HH:mm:ss
		SimpleDateFormat abc = new SimpleDateFormat("HH�� mm�� ss��");
		Date currentDate = new Date();
		String abcDate = abc.format(currentDate);
		System.out.println("�ú��� : " + abcDate);
		
	}
	public void practice3() { // ���� MM:dd
		SimpleDateFormat abc = new SimpleDateFormat("MM�� dd��");
		Date currentDate = new Date();
		String abcDate = abc.format(currentDate);
		System.out.println("���� : " + abcDate);
		
	}
	public void practice4() { // ����-�ð� yyyy-HH
		SimpleDateFormat abc = new SimpleDateFormat("yyyy�⵵");
		Date currentDate = new Date();
		String abcDate = abc.format(currentDate);
		System.out.println("���� : " + abcDate);
		
	}
	public void practice5() { // ��-��-�� ���� yyyy-MM-dd (E)
		SimpleDateFormat abc = new SimpleDateFormat("yyyy�� MM�� dd�� (E����)");
		Date currentDate = new Date();
		String abcDate = abc.format(currentDate);
		System.out.println("����� ���� : " + abcDate);
		
	}
}

//https://wakestand.tistory.com/523 ��¥ ���� url