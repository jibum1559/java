package com.kh.ThreadPratice;
//************get, set ������ while�� �ȿ� �־ �ذ��ϴ� ��� �˱�
import java.io.IOException;
import java.util.Random;

import com.kh.ThreadMain.SimpleGame;

public class GameMain {
	public static void main(String[] args) {
		//�ܺ� Ŭ������ �ν��Ͻ��� ����
		GameLoop bl = new GameLoop();
		
		// ���� ���� ������ ����
		Thread gameThread = new Thread(bl);
		gameThread.start();
		
		// ���� ���� ���� : �÷��̾ Enter Ű�� ������ ���� ����
		try {
			//����ڰ� Ű����� �Է��� ����Ʈ�� ����
			//����ڰ� EnterŰ�� ���� �� ���� ���α׷� �Ͻ� ����
			System.in.read(); 
			bl.setGameOver(true);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}