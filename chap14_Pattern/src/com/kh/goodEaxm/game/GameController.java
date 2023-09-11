package com.kh.goodEaxm.game;

import java.util.Scanner;

public class GameController {
	//		String
//	private int a; // �ν��Ͻ� ����
//	private String b; // ���� ����
	private GameModel model;
	private GameView view;
	
	public GameController(GameModel model, GameView view) {
		this.model = model;
		this.view = view;
	}
	
	public void runGame() {
		// ���� �޼��� �����ִ°� ����ϰ�
		view.displayMessage();
		// ��ĳ�� �Է��ؼ� �Է°� ȣ��
		Scanner sc = new Scanner(System.in);

		// ���� �����ϴ� ���� �Է�����
		view.displayGuessPromt();
		int guess = sc.nextInt();
		
		// ���࿡ ��ǻ�Ͱ� ������ ���ڸ� ������ �� �ҷ��� view
		while(true) { //false�� �� ������ �ݺ�
		//boolean isTrue = true;
			if(model.inCorrectGuess(guess)){ //"guess"�� �Է��� ���ڰ��� ������ ��)
				view.displayCorrectGuess();
				view.displayAttempts(model.getAempt());
				//isTrue = false;
				break;
			} else {
				// ��ǻ�Ͱ� ������ ���ڿ� ���� �Է��ϴ� ���ڰ� Ʋ���� �� view
				view.displayInCorrectGuess();
				view.displayAttempts(model.getAempt());
			}
			view.displayGameOver();
		}
		
		// ��ǻ�Ͱ� ������ ���ڿ� ���� �Է��ϴ� ���ڰ� Ʋ���� �� view
	//	view.displayInCorrectGuess();
	//	view.displayAttempts(model.getAempt());
		
	}
	public static void main(String[] args) {
		GameModel m = new GameModel();
		GameView v = new GameView();
		GameController c = new GameController(m,v);
		
		c.runGame();
	}
}
