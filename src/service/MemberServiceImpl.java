package service;

import java.util.ArrayList;

import entity.Member;

public class MemberServiceImpl implements MemberService {

	//�I�[�o�[���C�h�����ꍇ�A��������������ƃA�m�e�[�V���������̂ŁA@override�͂��Ă��������������B
	@Override
	public String greet(int i) {
		String[] greetings = {"Good morning","Hello","Good evning"};
		return greetings[i];
		
	}

	@Override
	public ArrayList<Member> getAll() {
		ArrayList<Member> list = new ArrayList<>();
		Member mem1 = new Member(1,"Linda","linda@example.com");
		Member mem2 = new Member(2,"James","james@example.com");
		list.add(mem1);
		list.add(mem2);
		
		return list;
	}


	//�~�j�ۑ�
	//���W�b�N����
	@Override
	public int sumOf(int x, int y) {
		//���[�J���ϐ�int sum =0���`
		int sum = 0;
		//for�����쐬�Bint i��x�Ɠ����l����n�܂�Ai��y�ȉ��ɂȂ�܂�for���\�b�h�����[�v�p���A+1���C���N�������g����B
		for(int i = x; i <= y; i++) {
			//�ϐ�sum�ɃC���N�������g���ꂽ���i�̒l��ǉ��ő�����Ă����i���Z�j
			sum += i;
			
		}
		//�v�Z���ʂ�sum�𑗂�Ԃ��Ă�����
		return sum;
		
	}
		
	
	
	/*
	 * @Override public ArrayList<SumOf> sumOf(int x,int y) { ArrayList<SumOf> sumof
	 * = new ArrayList<>();
	 * 
	 * 
	 * 
	 * 
	 * int numWidth = y - x; int result = x + y;
	 * 
	 * return result; }
	 */


}
