package P1;

import java.util.Scanner;

public class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String s[]= new String[5];
		for(int i=0;i<5;i++) {
			s[i]=input.next();
		}
		for(int i=0;i<5;i++) {
			System.out.print(s[i]+" ");
		}
		sortingArray(s);
		System.out.println();
		for(int i=0;i<5;i++) {
			System.out.print(s[i]+" ");
		}
	}
	
	 public static void sortingArray(String[] s) {
		  String tmp;
		  for(int i = 0; i < s.length-1; i++ ) {
	          for (int j = i+1; j < s.length; j++ ) {
	              if(s[j].length() < s[i].length()) {
	                  tmp = s[j];
	                  s[j] = s[i];
	                  s[i] = tmp;
	              }
	          }
	      }
	}

}
