package com.kh.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//�̹������� jpg �Ǵ� png ������ ����ȭ�鿡 ������ ��
//����ȭ�鿡�ٰ� ������ ����
//���� �ȿ� ������ �̹��� �����ϱ�!
public class PracticeCopy {

	public static void main(String[] args) {
		PracticeCopy am = new PracticeCopy();
		am.prectice1();
		am.prectice2();
	}
		public void prectice1() {
		String inputFile = "C:\\Users\\user1\\Desktop\\love.png";
		String outputFile = "C:\\Users\\user1\\Desktop\\Reallove.jpg";
		
		try(FileInputStream fis = new FileInputStream(inputFile);
				FileOutputStream fos = new FileOutputStream(outputFile)){
			byte[] buffer = new byte[1024];
			int byteRead;
		
		while ((byteRead = fis.read(buffer)) !=-1) {
			fos.write(buffer,0,byteRead);
		}
		System.out.println("���� ���� �Ϸ�");
		
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		}
		
		public void prectice2() {
			//����ȭ�鿡 ���� ���� ��
			//������� �̹��� ���� �̵�
			String Path = "C:\\Users\\user1\\Desktop\\new_img";
			
			String inputFile = "C:\\Users\\user1\\Desktop\\love.jpg";
			String ss = Path+"\\love.jpg";
			
			File newFolder = new File(Path);
			
			boolean success = newFolder.mkdir();
			
			if(success) {
				System.out.println("���� ���� �Ϸ�");
			} else {
				System.out.println("���� ���� ����");
			}
			
			try {
				FileInputStream fis = new FileInputStream(inputFile);
				FileOutputStream fos = new FileOutputStream(ss); 
				
				byte[] buffer = new byte[1024];
				int byteRead;
			
			while ((byteRead = fis.read(buffer)) != -1){
				fos.write(buffer,0,byteRead);
			}
			System.out.println("������ ����Ǿ����ϴ�.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
