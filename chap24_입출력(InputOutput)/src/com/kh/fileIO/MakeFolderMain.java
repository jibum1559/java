package com.kh.fileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MakeFolderMain {

	public static void main(String[] args) {
		//������ ������ ��� ����
		String folderPath = "C:\\Users\\user1\\Desktop\\new_folder"; //���ϴ� ��� ����
		//���� �����
		File folder = new File(folderPath);
		
		// exists �̹� �����ϴ��� Ȯ��
		if(!folder.exists()) {
			folder.mkdir(); //mk �� make�� ���Ӹ� / dir(directory) ���丮 - ����, ī�װ�, �з��ϴ� ���� / ���� ���� ����� ��ɾ� mkdir
			System.out.println("������ ���������� �����Ǿ����ϴ�.");
		} else {
			System.out.println("������ �̹� �����մϴ�.");
		}
			
		try {
			FileWriter w = new FileWriter("C:\\Users\\user1\\Desktop\\new_folder\\Userinfo.txt");
			w.write("User ������ ��� ���Դϴ�.");
			w.write("KH �л�");
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}