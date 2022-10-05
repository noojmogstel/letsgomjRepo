package P1;

import java.util.ArrayList;
import java.util.Scanner;

public class week3p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n,k;
		
		while(input.hasNext()) {
			int count=0 ,posit=0;
			n=input.nextInt();
			k=input.nextInt();
			
			ArrayList<Character> arr = new ArrayList<>();
			arr.add('T');
			
			for(int i=1;i<n;i++) {
				arr.add('O');
			}
			
			
			while(arr.contains('T') && arr.size()!=1) {
				
				if(posit+k>=arr.size()) {
				
					if((posit+k)%arr.size()!=0) {
				
					posit=(posit+k)%arr.size();	}
					
					else {
						posit=0;}
					
					
					
					
					arr.remove(posit);
					
					
					}
				else {	
					if (posit==0) {
						
			arr.remove((posit+k)%(arr.size()+1));
			
			posit=k;}
					
					else {
						
						arr.remove(posit+k-1);
						posit=(posit+k)%(arr.size()+1);
						
					}
			
				}
			
			count++;
			
			
			}
			if(arr.size()==1 && arr.contains('T'))
				System.out.println("win");
			
			else
			System.out.println(count);
		}
		
		
	}

}
