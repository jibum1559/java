package com.kh.example.practice4.model.vo;

public class Student03 {
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;

	public int getGrade() {
		return grade;
	}
	public int getClassroom() {
		return classroom;
	}
	public String getName() {
		return name;
	}
	public double getHeight() {
		return height;
	}
	public char getGender() {
		return gender;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void information() {
		System.out.println("�츮 " + classroom + "�ݿ� �౸ ���ϴ� " + gender + "�ھְ� " + "�Ѹ� �־�!!");
		System.out.println("�̸��� " + name + "�̰� Ű�� " + height + "�ۿ� �ȵǴµ� �߷յ������̾�!");
		System.out.println("�౸�δ� ���� " + grade + "�� �̾�~!");
	
		
	}
	
}