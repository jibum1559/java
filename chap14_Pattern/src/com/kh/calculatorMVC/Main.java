package com.kh.calculatorMVC;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Model View Controller
		// model = CalculatorModel ��������
		// view = CalculatorView ��������
		// Controller CalculatorController ��������

		//model = CalculatorModel ��������
		CalculatorModel model = new CalculatorModel();
		//view = CalculatorView ��������
		CalculatorView view = new CalculatorView();
		//Controller CalculatorController ��������
		CalculatorController controller = new CalculatorController(model, view);
		
		controller.run();
		
	}

}