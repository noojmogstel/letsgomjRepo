package P1;

import java.util.ArrayList;
import java.util.Scanner;

public class week5 {

	
		
		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			String s = input.nextLine();
			ArrayList<Character> kor = new ArrayList<Character>();
			ArrayList<Character> eng = new ArrayList<Character>();
			
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)>='가' && s.charAt(i)<='힣') {
					kor.add(s.charAt(i));
					
				}
				
				else {
					eng.add(s.charAt(i));
					
				}
				
				
			}
			System.out.println(kor);
			System.out.println();
			System.out.println("깃허브에 올려보기 다시 commit 만 ㅋㅋ");
			System.out.println("깃허브에 올려보기 다시 commit 만 ㅋㅋ");
			System.out.println("깃허브에 올려보기 다시 commit 만 ㅋㅋ");
			System.out.println("깃허브에 올려보기 다시 commit 만 ㅋㅋ");
			System.out.println("깃허브에 올려보기 다시 commit 만 ㅋㅋ");
			System.out.println("깃허브에 올려보기 다시 commit 만 ㅋㅋ");
			System.out.println("깃허브에 올려보기 다시 commit 만 ㅋㅋ");
			System.out.println("깃허브에 올려보기 다시 commit 만 ㅋㅋ");
			System.out.println("깃허브에 올려보기 다시 commit 만 ㅋㅋ");
			
		
	}

}
