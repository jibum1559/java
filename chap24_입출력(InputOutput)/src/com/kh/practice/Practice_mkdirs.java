package com.kh.practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Practice_mkdirs {

	public static void main(String[] args) {
		Practice_mkdirs pm = new Practice_mkdirs();
		pm.Practice1();
		pm.Practice2();
		pm.Practice3();
	}
	public void Practice1(){
		//���� �������� 2�� ����� C:\\Users\\user1\\Desktop\\�̸�1\\�̸�2
		//1. ������ ������ �ּҸ� ���Ѵ�
		String dirPath = "C:\\Users\\user1\\Desktop\\school\\studentInfo";
		
		//2.file ��ü ����
		File dir = new File(dirPath);
		
		//mkdirs �޼��带 ����ؼ� ���丮 �����õ�
		boolean success = dir.mkdirs();
		if(success) {
			System.out.println("���� ���� ����.");
		} else {
			System.out.println("���� ���� ����.");
		}
		
	}
	public void Practice2() {
		//���� �������� 3�� ����� C:\Users\\user1\Java_Workspace\\chap25
		//1.������ ������ �ּҸ� ���Ѵ�.
		String aPath = "C:\\Users\\user1\\Desktop\\aaa\\bbb\\ccc";
		//2.file ��ü ����
		File dir = new File(aPath);
		
		//3.mkdirs �޼��� ����ؼ� ���丮 �����õ�
		boolean success = dir.mkdirs();
		
		if(success) {
			System.out.println("���� ���� ����.");
		} else {
			System.out.println("���� ���� ����.");
		}	
	}
	
		public void Practice3() {
			//���� �������� 5�� ����� C:\\Users\\user1\\Documents\myPlace\Music\Korean\KPOP\Group
			String dirPath = "C:\\Users\\user1\\Documents\\My\\name\\is\\seung\\beom";
			File dir = new File(dirPath);
			
			boolean success = dir.mkdirs();
			
			if(success) {
				System.out.println("���� ���� ����.");
			} else {
				System.out.println("���� ���� ����.");
			}
	}

}
