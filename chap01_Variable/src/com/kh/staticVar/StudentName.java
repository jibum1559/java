package com.kh.staticVar;

public class StudentName {
	public static void main(String[] args) {
		StaticVar stKim = new StaticVar();
		stKim.setStudentName("kh�л�1");
		System.out.println(stKim.serialNum);
		stKim.serialNum++;
		
		StaticVar khLee = new StaticVar();
		khLee.setStudentName("kh�л�2");
		System.out.println("KH stKim : ");
		System.out.println(stKim.serialNum);
		
		System.out.println("KH stLee : ");
		System.out.println(khLee.serialNum);
	}

}
