package com.kh.instance.cafe;
// �ν��Ͻ� 3�� ����� ����ϱ�

public class CafeMain {

	public static void main(String[] args) {
								//������ ��������
		Cafe client1 = new Cafe("�Ƹ޸�ī��", "��Ƽ ������", false);
		Cafe client2 = new Cafe("ī���", "�⺻ ������", true);
		Cafe client3 = new Cafe("���ڶ�", "�⺻ ������", false);
		
		
		client1.OderCoffee();
		client2.OderCoffee();
		client3.OderCoffee();
	}

}
