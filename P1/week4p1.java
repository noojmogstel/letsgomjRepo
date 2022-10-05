package P1;

import java.util.Scanner;

public class week4p1 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		

		
		String str = input.nextLine();
		
			
		char c [][] = new char[str.length()*2-1][str.length()*2-1];
		
		for(int i=0;i<str.length()*2-1;i++) {
			for(int j=0;j<str.length()*2-1;j++) {
				c[i][j]='*';
			}
			
		}
		
	
		c[str.length()-1][str.length()-1]=str.charAt(0);
		
		for(int i=1;i<str.length();i++) {
			c[str.length()-1-i][str.length()-1]=str.charAt(i);
			c[str.length()-1+i][str.length()-1]=str.charAt(i);
			c[str.length()-1][str.length()-1-i]=str.charAt(i);
			c[str.length()-1][str.length()-1+i]=str.charAt(i);
			
			c[str.length()-1-i][str.length()-1-i]=str.charAt(i);
			c[str.length()-1+i][str.length()-1-i]=str.charAt(i);
			c[str.length()-1-i][str.length()-1+i]=str.charAt(i);
			c[str.length()-1+i][str.length()-1+i]=str.charAt(i);
			
			
			
		}
		
		
		/*배열 확인 for문*/
		for(int i=0;i<str.length()*2-1;i++) {
			for(int j=0;j<str.length()*2-1;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
			
		}
		
		
		
		
	
		
}
}

