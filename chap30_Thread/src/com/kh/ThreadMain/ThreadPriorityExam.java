package com.kh.ThreadMain;

public class ThreadPriorityExam {

	public static void main(String[] args) {
		StudentThread st1 = new StudentThread("�л� 1");
		StudentThread st2 = new StudentThread("�л� 2");
		StudentThread st3 = new StudentThread("�л� 3");
		StudentThread st4 = new StudentThread("�л� 4");
		
		//�����忡 �켱���� ����
		st1.setPriority(Thread.MAX_PRIORITY); //�켱������ �ִ�� ����
		st2.setPriority(Thread.MAX_PRIORITY); //�켱������ �ּҷ� ����
		st3.setPriority(Thread.MIN_PRIORITY); //�켱������ �ּҷ� ����
		st4.setPriority(Thread.MIN_PRIORITY); //�켱������ �ּҷ� ����
		
		// ������ ����
		st1.start();
		st2.start();
		st3.start();
		st4.start();
		
		
	}

}