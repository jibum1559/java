package com.kh.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain am = new PracticeMain();
//		am.practice1();
		am.practice2();
	}
	
	public void practice1() {
		try {
			FileWriter w = new FileWriter("C:\\Users\\user1\\Desktop\\�̸� ��.txt"); //��� �߰� 
			//���� ����
			w.write("������ ������� �׽�Ʈ");
			//���� �ݱ�
			w.close();
			
			//��⼭ ������ ��ΰ� Ȯ���� ��� = ������
			FileReader reader = new FileReader("C:\\Users\\user1\\Desktop\\�̸� ��.txt"); //(path +"//checkFile.txt"); �� ����� ����
			BufferedReader bufferdReader = new BufferedReader(reader);
			
			String line;
			while ((line = bufferdReader.readLine()) != null) {
				System.out.println(line);
			}
			
			bufferdReader.close(); //������ �� ������ �ݾ��ֱ�.
			
			System.out.println("���� ���� �Ϸ�");
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("���� ���� ����");
		}
	}
	
	public void practice2() {
		//������ ����� ���� �ȿ� ������ �����
		//���� �ȿ� ���� �ۼ��ϱ�
		
		// File.separtor 
		// window : \
		// Linux or MacOs : /
		
		
		final String path = "C:\\Users\\user1\\Desktop"; //���ϴ� ��� ����
		String folderPath = path + "\\Userinfo_folder"; //���ϴ� ��� ����

		File f = new File(folderPath);
		// exists �̹� �����ϴ��� Ȯ��
		if(!f.exists()) {
				f.mkdir(); 
				System.out.println("������ ���������� �����Ǿ����ϴ�.");
		} else {
				System.out.println("������ �̹� �����մϴ�.");
		}
		
		FileWriter w;
		try {
			w = new FileWriter(folderPath + "��¹� ����.txt");
			w.write("���� : ��¹�");
			w.write("����ó : 010-9910-2165");
			w.close();
			System.out.println("���� ���� �Ϸ�");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
	}
}
