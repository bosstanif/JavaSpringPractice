package service;

import java.util.ArrayList;

import entity.Member;

public interface MemberService {

	String greet(int i);
	
	//Shift+Ctrl+O �ŃC���|�[�g������e��I���B���O�ɍ쐬����Entity��I��
	ArrayList<Member> getAll();
	
	//�~�j�ۑ�p�@
	int sumOf(int x, int y);
	
}
