package com.kh.instance.tv;
//Tv ����
public class Tv {
	//Tv �Ӽ�(�ʵ�)
	String color; //tv����
	boolean power; //��������
	int channel; //ä��
	
	//Tv ���(�޼���)
	public void power() {
		power = !power; //���� ����
	}
	public void channerlUp() {
		++channel;
	}
	
	public void channelDown() {
		--channel;
	}
}


/*
 ������� => ���� �����
 			����������[�� �Ǵ� �������� ���� ��ü�� ������ �Ҵ�]
 			�ν��Ͻ������� [����� ������ ���]
 */