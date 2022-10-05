package P1;

import java.util.Arrays;

public class uyguyvyyv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int n[]=new int [20];
	
		
		for(int i=0;i<20;i++) {
			n[i]=(int) (Math.random()*50);
		}
		
		for(int i=0;i<20;i++) {
			System.out.println(n[i]+" ");
		}
		
		Arrays.sort(n);
		System.out.println("sorting");
		for(int i=0;i<20;i++) {
			System.out.println(n[i]+" ");
		}
		
		
	
	}

}
