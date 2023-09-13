package com.kh.api.exam1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateMain {
/*
 Date : ��¥�� �ð� ������ ��Ÿ���µ� ���
  		java1.1 ���� ������� ����
  			jaava.time ��Ű�� LocalDate LocalTime LocalDateTime
 */
	public static void main(String[] args) {
		//import java.time.LocalDate;
		LocalDate currentDate = LocalDate.now();
		System.out.println("���� ��¥ : " + currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("���� �ð� : " + currentTime);
		
		LocalDateTime currentDT = LocalDateTime.now();
		System.out.println("���� ��¥�� �ð� : " + currentDT);
		
		//��¥ ���
		LocalDate today = LocalDate.now();
		LocalDate futureDate = today.plusDays(7);
		System.out.println("7�� �� ��¥ : " + futureDate);
		
		//minus plus �̿��ؼ� 2���� ������ �� 4��
		
		LocalDate today2 = LocalDate.now();
		LocalDate fdate = today2.plusDays(20);
		System.out.println("�߼��� " + fdate + " �Դϴ�.");
		LocalDate fdate2 = today2.plusDays(180);
		System.out.println("���� �������� " + fdate2 + " �Դϴ�.");
		
		LocalDate yday = LocalDate.now();
		LocalDate ydate = today2.minusWeeks(1);
		System.out.println("���� �� : " + ydate);
		LocalDate ydate2 = today2.minusMonths(1);
		System.out.println("���� �� : " + ydate2);
		
		LocalTime nowTime = LocalTime.now();
		LocalTime laterTime = nowTime.plusHours(3);
		System.out.println("3�ð� �� �ð� : " + laterTime);
		
		//of Ư�� ��¥�� �ð� �����ϱ�
		LocalDate date1 = LocalDate.of(2023, 9, 13);
		LocalDate date2 = LocalDate.of(2023, 8, 13);
	
		//date1.isBefore(date2)
		//date1.isAfter(date2)
		
		if(date1.isBefore(date2)) {
			//��¸޼ҵ�
			System.out.println(date1 + "�� " + date2 + " �����Դϴ�.");
		} else if (date1.isAfter(date2)) {
			//��¸޼ҵ�
			System.out.println(date1 + "�� " + date2 + " �����Դϴ�.");
		} else {
			//��¸޼ҵ�
			System.out.println(date1 + "�� " + date2 + " �� ���� ��¥ �Դϴ�.");
		} 
	}

}
