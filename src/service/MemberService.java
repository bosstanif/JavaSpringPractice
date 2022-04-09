package service;

import java.util.ArrayList;

import entity.Member;

public interface MemberService {

	String greet(int i);
	
	//Shift+Ctrl+O でインポートする内容を選択。事前に作成したEntityを選ぶ　
	ArrayList<Member> getAll();
	
	//ミニ課題用①
	int sumOf(int x, int y);
	
}
