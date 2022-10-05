package P1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class week5p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		ArrayList<Character> a = new ArrayList<Character>();
		ArrayList<Character> b = new ArrayList<Character>();
		
		int aCount=0;int bCount=0; 
		String aString = input.nextLine();
		String bString = input.nextLine();
		
		
		for(int i=0;i<aString.length();i++) {
			a.add(aString.charAt(i));
		}
		
		for(int i=0;i<bString.length();i++) {
			b.add(bString.charAt(i));
		}
		
		
		while(true) {
			char c = input.next().charAt(0);
			if(c=='e')
				break;
			
			else if(c=='u') {
				a.remove(0);
				b.remove(b.size()-1);
				
				
			}
			
			else  {
				b.remove(0);
				a.remove(a.size()-1);
				
			}
			
			
		}
		
		
			boolean contains = true;
			boolean perfectContain = true;
			
		
		
		
			for(int i=0;i<a.size();i++) {
				
				if((a.get(i)>='a' && a.get(i)<='z') ||(a.get(i)>='A' && a.get(i)<='Z')){
				if(b.contains(a.get(i))){
					
				}
				
				else if(b.contains(Character.toLowerCase(a.get(i))) || b.contains(Character.toUpperCase(a.get(i))) ) {
					perfectContain = false;
				}
				else {
					contains=false;
				}
			}
		
			
			}
		
		if(a.size()==0) {
			System.out.println("Miss");
		}
		else if(contains && perfectContain) {
			System.out.println("Perfect");
			
		}
		else if(contains) {
			System.out.println("Good");
		}
		else {
			System.out.println("Miss");
		}
		
		
		
		
		
		
		
	}

}
