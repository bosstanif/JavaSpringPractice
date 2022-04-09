package service;

import java.util.ArrayList;

import entity.Member;

public class MemberServiceImpl implements MemberService {

	//オーバーライドした場合、自動生成させるとアノテーションがつくので、@overrideはつけておいた方がいい。
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


	//ミニ課題
	//ロジック部分
	@Override
	public int sumOf(int x, int y) {
		//ローカル変数int sum =0を定義
		int sum = 0;
		//for文を作成。int iがxと同じ値から始まり、iがy以下になるまでforメソッドがループ継続、+1ずつインクリメントする。
		for(int i = x; i <= y; i++) {
			//変数sumにインクリメントされた後のiの値を追加で代入していく（合算）
			sum += i;
			
		}
		//計算結果のsumを送り返してあげる
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
