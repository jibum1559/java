package com.kh.switchsample;

public class SwitchSample {

	public static void main(String[] args) {
		// Switch��
		/*
		 Ư�� ������ ǥ������ ���� ���� �پ��� ��츦 ó���ϴ� ���� ����
		 switch ���� �Ϸ��� case ���� �ش� ���� ���Ͽ� ��ġ�ϴ� ��쿡 �ش��ϴ� �ڵ� ����� ����
		 �� case�� �ڿ��� ��ġ�ϴ� ���̳� ǥ������ ����
		 
		 switch (���� �Ǵ� ǥ����) {
		 	case ��1 :
		 		//��1�� �ش��ϴ� �ڵ�
		 		 break; //�ش� ����� ������ �ߴ��ϴ� ����
		 	case ��2 : 
		 		//��2�� �ش��ϴ� �ڵ�
		 		 break;
			default :
				//�� ��� ���̽��� ��ġ���� ���� �� ����Ǵ� �ڵ�
		 }
		 */
		int september = 17;
		switch (september) {
			case 4: case 11: case 18: case 25:
			System.out.println("��.. �������Դϴ�..");
			break;
			
			case 5: case 12: case 19: case 26:
				System.out.println("���� ȭ�����̿���..");
			break;
			
			case 6: case 13: case 20: case 27:
				System.out.println("���� �ݿԳ�. �������Դϴ�.");
			break;
			
			case 7: case 14: case 21: case 28:
				System.out.println("����.. ������̴�..!");
			break;
			
			case 1: case 8: case 15: case 22: case 29:
				System.out.println("�ұ�!!!!!!!!");
			break;
			
			case 2: case 9: case 16: case 23: case 30:
				System.out.println("��ſ� �����~~~~");
			break;
			
			case 3: case 10: case 17: case 24:
				System.out.println("�Ͽ����̶� ���� ������ ���� ������..");
			break;
			
			default:
				System.out.println("���� �ִ� 31�ϱ��� �ۿ� �����~~");
				
		}
		
		// Ŀ�Ǹ� �ֹ��ҰԿ�.
		/*
		 1���� �����ϸ� �Ƹ޸�ī��
		 2���� �����ϸ� ī��  ��
		 3���� �����ϸ� ���ν����
		 4���� �����ϸ� ������Ƽ
		 * */
		
		int choice = 1;
		switch (choice) {
			//1���� �����ϸ� �Ƹ޸�ī��
			case 1:
				System.out.println("�Ƹ޸�ī�� �ֹ��ϼ̽��ϴ�.");
				break;
			//2���� �����ϸ� ī�� ��
			case 2:
				System.out.println("ī�� �󶼸� �ֹ��ϼ̽��ϴ�.");
				break;
			//3���� �����ϸ� ���ν����
			case 3:
				System.out.println("���ν���ʸ� �ֹ��ϼ̽��ϴ�.");
				break;
			//4���� �����ϸ� ������Ƽ
			case 4:
				System.out.println("��� ����Ƽ�� �ֹ��ϼ̽��ϴ�.");
				break;
			default:
				System.out.println("�߸��� �����Դϴ�. �ٽ� �ֹ����ּ���.");
		}		
		
	}

}
