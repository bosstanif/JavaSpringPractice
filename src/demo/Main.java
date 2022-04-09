package demo;

import java.util.ArrayList;

import entity.Member;
import service.MemberServiceImpl;

public class Main {

	public static void main(String[] args) {
		MemberServiceImpl service = new MemberServiceImpl();
		System.out.println(service.greet(2));
		
		System.out.println(service.getAll());
		ArrayList<Member> list = service.getAll();
		for(Member mem : list) {
			System.out.println(mem.getId() + "," + mem.getName() + "," + mem.getEmail());			
		}
		
		//�~�j�ۑ�p
		//service.��(11�s�ڂ̃C���X�^���X)��sumOf������x,y�̒l����ꃁ�\�b�h�����s�����
		//���\�b�h���s��Ɂ@return�Ƃ��� �ϐ�sum�̌��ʂ��Ԃ��Ă����B
		System.out.println(service.sumOf(0, 5));

	}

}
