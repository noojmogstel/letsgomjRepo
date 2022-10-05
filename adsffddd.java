package P1;

import java.util.ArrayList;
import java.util.Scanner;

public class adsffddd {

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
		for(int i=0;i<eng.size();i++) {
			System.out.print(eng.get(i));
		}
		for(int i=0;i<kor.size();i++) {
			System.out.print(kor.get(i));
		}
		System.out.println();
		System.out.println(kor.size());
		System.out.println(eng.size()+" "+kor.size()+" "+(eng.size()+kor.size()));
		
	}

}
