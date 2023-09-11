package com.kh.goodEaxm.game;

public class GameView {
	private String StartMsg = "���� ���߱� ������ �����մϴ�.";
	private String GuessNum = "������ ���ڸ� �Է��ϼ���.";
	private String Correct = "���ڸ� ������ϴ�.";
	private String InCorrect = "Ʋ�Ƚ��ϴ�. �ٽ� �õ��ϼ���.";
	private int Attempts;
	private String GameOver = "���� ����";

	public void displayMessage() {
		System.out.println("���� ���߱� ������ �����մϴ�.");
		System.out.println("1���� 100 ������ ���ڸ� ���纸����.");
		
	}
	// ���ڸ� �����ϴ� �� �Է��ϰ� ������� Ʋ�ȴ��� ���°Ŷ� �õ�Ƚ�� ���� ����
	// 1. ���� �����ϴ� �� �Է��ϱ�
	public void displayGuessPromt() {
		System.out.println("������ ���ڸ� �Է��ϼ���.");
		
	}
	public void displayCorrectGuess() {
		System.out.println("���ڸ� ������ϴ�.");
	}
	public void displayInCorrectGuess() {
		System.out.println("Ʋ�Ƚ��ϴ�. �ٽ� �õ��ϼ���.");
		
	}
	public void displayAttempts(int attempts) {
		System.out.println("�õ�Ƚ�� : " + attempts);
	}
	
	public void displayGameOver() {
		System.out.println("��������");
	}
	
}
