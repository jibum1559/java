package com.kh.listAndArray;

import java.util.ArrayList;
import java.util.List;

public class ListAndArray {

	public static void main(String[] args) {
		ListArray1();
		ListAndArray LAA = new ListAndArray();
		LAA.ListArray2();
	}
	
		//Array ����
		public static void ListArray1() {
		int[] intArray = new int[2]; //ũ�Ⱑ 2�� ���� �迭 ����  //ù ��°���� ���� ��������� �׷��� ���� 3�� �̻� ������ ������ ��
		intArray[0] = 1;
		intArray[1] = 2;
      //intArray[2] = 3;
		
		//Array ���
		System.out.println("Array ��� : ");
		
		for(int a = 0; a < intArray.length; a++) {
			System.out.println(intArray[a] + " ");
		}
		System.out.println(); //���๮�� ���Ե��־� enter���� ������ �Ѵ�.
		//List ����				//�� �迭 ����Ʈ
		List<Integer> intList = new ArrayList<>(); //Integer ��ü�� �����ϴ� ArrayList ����
		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		//List ���
		System.out.println("List ��� : ");
		for (int num : intList) {
			System.out.println(num + " ");
			}
		}
	
	
		public void ListArray2() {
		//String���� ���� �� Array�� List ����غ���
		
		String string = "{����,���,�ٳ���}";
		String[] stringArray = new String[3];
		
		stringArray[0] = "����";
		stringArray[1] = "���";
		stringArray[2] = "�ٳ���";
		
		System.out.println("Array ��� : ");
		for(int i = 0; i < stringArray.length; i++) {
			System.out.println(stringArray[i] + " ");
		}
		
		List<String> stringList = new ArrayList<>();
		stringList.add(0,"����");
		stringList.add(1,"���");
		stringList.add(2,"�ٳ���");
		stringList.add(3,"����");
		stringList.add(4,"Ű��");
		stringList.add(5,"��");
		
		System.out.println("List ��� : ");
		for(String j : stringList) {
			System.out.println(j + " ");
			
		}
	}
}

