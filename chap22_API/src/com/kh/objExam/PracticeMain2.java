package com.kh.objExam;

public class PracticeMain2 {

	public static void main(String[] args) {
		PracticeMain2 am = new PracticeMain2();
		am.practic1();
		am.practic2();
		am.practic3();
		am.practic4();
		am.practic5();
	}
	
	public void practic1() {
		//���ڿ� �� ���̱� ��� append
		StringBuffer sb = new StringBuffer();
		sb.append("���� "); //������ ������
		sb.append("������ ������ "); 
		System.out.println(sb);
	}
	
	public void practic2() {
		//���ڿ� ������ reverse
		StringBuffer sb = new StringBuffer();
		sb.append("���� ������ ������");
		sb.reverse();//	("���� ������ ������");
		System.out.println(sb);
		//System.out.println(sb.toString());
	
	}
	public void practic3() {
		//���ڿ� ���� insert ? ���� �ֱ�
		StringBuffer sb = new StringBuffer();
		sb.append("���� ������ ������");
		sb.insert(10, "? ������");//	("���� ������ ������");
		System.out.println(sb.toString());
	
	}
	public void practic4() {
		//���ڿ� ��ü replace(,,);
		StringBuffer sb = new StringBuffer();
		sb.append("���� ������ ������");
		sb.replace(2,3, ",,");//	("���� ������ ������");
		System.out.println(sb.toString());

	}
	public void practic5() {
		//���ڿ� ���� delete
		StringBuffer sb = new StringBuffer();
		sb.append("���� ������ ������");
		sb.delete(1,3);// 1~3���� // 0a1b2c3
		System.out.println(sb.toString());
	}
	
}
