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
		
		//ミニ課題用
		//service.内(11行目のインスタンス)のsumOf仮引数x,yの値を入れメソッドを実行すると
		//メソッド実行後に　returnとして 変数sumの結果が返ってくるよ。
		System.out.println(service.sumOf(0, 5));

	}

}
