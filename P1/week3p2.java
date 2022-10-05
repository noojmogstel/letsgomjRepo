package P1;
	
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Scanner;
	
	public class week3p2 {
	
			
		public static void main(String args[]) {
			
			Scanner input = new Scanner(System.in);
			
			int testCase = input.nextInt();
			int days,p;
			
			
			for(int i=0;i<testCase;i++) {
				days = input.nextInt();
				p = input.nextInt();
				int h[] = new int[p];
				
				for(int j=0;j<p;j++) {
					h[j]=input.nextInt();
				}
				Arrays.sort(h);
				int day[]= new int [days];
				
				for(int k=0;k<p;k++) {
				for(int j=1;j<=days/h[k];j++) {
					
					day[h[k]*j-1]++;
					
					
					}
				}
				
				int count=0;
				if(p%2==0) {
				for(int j=0;j<days;j++) {
					if(day[j]>=p/2 && (j)%7!=0 && (j+1)%7!=0 &&(j+4)%7!=0) {
						count++;
					}
				}
				if(i==1){
					System.out.println();
				}
				System.out.println("Lost: "+count);
				
				for(int j=0;j<days;j++) {
					if(day[j]>=p/2 && (j)%7!=0 && (j+1)%7!=0 && (j+4)%7!=0) {
						switch(j%7) {
						case 1:
							System.out.println("Mon: " +(j+1));
							break;
						case 2:
							System.out.println("Tue: " +(j+1));
							break;
							
					
							
						case 4:
							System.out.println("Thu: " +(j+1));
							break;
							
						case 5:
							System.out.println("Fri: " +(j+1));
							break;
							
						default:
							break;
								
						}
					}
				}
				System.out.println();
				}
				
				else {
					for(int j=0;j<days;j++) {
						if(day[j]>p/2 && (j)%7!=0 && (j+1)%7!=0 &&(j+4)%7!=0) {
							count++;
						}
					}
					if(i==0){
						System.out.println();
					}
					System.out.println("Lost: "+count);
					
					for(int j=0;j<days;j++) {
						if(day[j]>p/2 && (j)%7!=0 && (j+1)%7!=0 && (j+4)%7!=0) {
							switch(j%7) {
							case 1:
								System.out.println("Mon: " +(j+1));
								break;
							case 2:
								System.out.println("Tue: " +(j+1));
								break;
								
								
							case 4:
								System.out.println("Thu: " +(j+1));
								break;
								
							case 5:
								System.out.println("Fri: " +(j+1));
								break;
								
							default:
								break;
									
							}
						}
					}
					System.out.println();
				}
				
				
				
			}
		}
	}
