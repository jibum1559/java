package com.kh.practice.student.model.vo;

public class StudentModel {
	private String name;	// �̸�
	private String subject; // ����
	private int score;  	// ����
	
	public StudentModel(String name, String subject, int score) {
		this.name = name;
		this.subject = subject;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	public String getSubject() {
		return subject;
	}
	public int getScore() {
		return score;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setSubject() {
		this.subject = subject;
	}
	public void setScore() {
		this.score = score;
	}
	
	public void inform(String name, String subject) {
		
	}
}
