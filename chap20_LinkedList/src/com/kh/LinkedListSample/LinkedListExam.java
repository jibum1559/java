package com.kh.LinkedListSample;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {
	
	public static void main(String[] args) {
		// List �������̽� LinkedList ��ü Ȱ���ؼ� ���ְ� ���
		List<String> list = new LinkedList<>();
		list.add("ȫ�浿");
		list.add("�̼���");
		list.add("ȫ����");
		
		System.out.println(list);
		// String �� �ְ� ���� ���� ���
		list.set(2, "������");
		System.out.println(list);
		
		list.remove(0);
		System.out.println(list);
		// LinkedList ��ü new LinkedList ��ü
		
		List<Integer> intList = new LinkedList<>();
		intList.add(3);
		intList.add(2);
		System.out.println(intList);
		
		
		// int �� �ְ� ���� ���� ���
	}

}