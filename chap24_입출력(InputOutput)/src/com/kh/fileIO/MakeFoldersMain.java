package com.kh.fileIO;

import java.io.File;

public class MakeFoldersMain {
/* 
 mkdirs
 ����ȭ�鿡 / kh / image  ������ ������� ������ִ� �༮
 �θ� ��Ʈ�ΰ� �������� �ʴ� ��쿡 �߰� ��� ���丮 ����
*/
	public static void main(String[] args) {
		String dirPath = "C:\\Users\\user1\\Desktop\\parent\\child\\file";
		
		//file ��ü ����
		File dir = new File(dirPath);
		
		//mkdirs �޼��带 ����Ͽ� ���丮 ���� �õ�
		boolean success = dir.mkdirs();
		
		if(success) {
			System.out.println("���� ���� ����");
		} else {
			System.out.println("���� ���� ����.");
		}
		
	}

}
