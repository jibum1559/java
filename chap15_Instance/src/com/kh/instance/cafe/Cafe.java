package com.kh.instance.cafe;
//���� ����
//���� ������
//���� ����

public class Cafe {
	private String type; //���� ����
	private String size; 	//���� ������
	boolean isSugar; 	//���� ����
	
	public Cafe(String type, String size, boolean isSugar) {
		this.type = type;
		this.size = size;
		this.isSugar = isSugar;
	}
	public void OderCoffee() {
		System.out.println("�ֹ��� ����� : " + type);
		System.out.println("ũ��� : " + size);
		
	if(isSugar) {
		System.out.println("���� �߰� : ");
	} else {
		System.out.println("������ ���� �����ּ���.");
	}
	
		
	
	
	
	/*private int size; //�Ƹ޸�ī�� ������
	private boolean hasSugar; //��������
	
	public Cafe(int size, boolean hasSugar) {
		this.size = size;
		this.hasSugar = hasSugar;
				
	}
	
		
		//���࿡ ������ �ִ´ٸ�
		if(hasSugar) { //true
			System.out.println("���� �߰� : " + hasSugar);
		}*/
		
	}

}
