package com.kh.todoList;
// *************���� �ٽ� Ǯ���**********************************************************
public class TodoListmain {

	public static void main (String[] args) {
		TodoListModel tdmodel = new TodoListModel("��ħ �Ա�!");
		TodoListView tdView = new TodoListView();
	
		System.out.println(tdmodel);
		String item = tdmodel.getItem();
		tdView.displayTodoList();
		
	}
}
