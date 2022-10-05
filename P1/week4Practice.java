package P1;

import java.util.Scanner;

public class week4Practice {
 
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int m,n;
	
		m = input.nextInt();
		n = input.nextInt();
		input.nextLine();
		
		char c[][] = new char[m][n];
		
		for(int i=0;i<m;i++) {
			String str;
			str=input.nextLine();
			for(int j=0;j<n;j++) {
				c[i][j]=str.charAt(j);
			}
			
		}
		

		findTeemo(c,m,n);
		
		
		
	}
	
	public static void findTeemo(char[][] str,int m, int n) {
		char[][] newTeemo =new char[m][n];
		char[][] reverseStr =new char[m][n];
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				newTeemo[i][j]=str[i][j];
				reverseStr[i][j]=str[m-i-1][n-j-1];
			}
		}
	
		

		
		/*가로로 찾기*/
		for(int i=0;i<m;i++) {
			for(int j=0;j<=n-5;j++) {
			
			if((str[i][j+1]=='E' ||  str[i][j+1]=='e')
					&& (str[i][j+2]=='E' ||  str[i][j+2]=='e')
					&& (str[i][j+3]=='M' ||  str[i][j+3]=='m')
					) {
				for(int k=0;k<5;k++) {
					newTeemo[i][j+k]='#';				}
					
			}
			
			else if((str[i][j+1]=='E' ||  str[i][j+1]=='e')
					&& (str[i][j+3]=='M' ||  str[i][j+3]=='m')
					&& (str[i][j+4]=='O' ||  str[i][j+4]=='o')
					) {
				for(int k=0;k<5;k++) {
					newTeemo[i][j+k]='#';				}
					
			}
			
			else if((str[i][j+1]=='E' ||  str[i][j+1]=='e')
					&& (str[i][j+2]=='E' ||  str[i][j+2]=='e')
					&& (str[i][j+4]=='O' ||  str[i][j+4]=='o')
					) {
				for(int k=0;k<5;k++) {
					newTeemo[i][j+k]='#';				}
					
			}
			
			else if((str[i][j]=='T' ||  str[i][j]=='t')
					&& (str[i][j+2]=='E' ||  str[i][j+2]=='e')
					&& (str[i][j+4]=='O' ||  str[i][j+4]=='o')
					) {
				for(int k=0;k<5;k++) {
					newTeemo[i][j+k]='#';				}
					
			}
			
			else if((str[i][j]=='T' ||  str[i][j]=='t')
					&& (str[i][j+2]=='E' ||  str[i][j+2]=='e')
					&& (str[i][j+3]=='M' ||  str[i][j+3]=='m')
					) {
				for(int k=0;k<5;k++) {
					newTeemo[i][j+k]='#';				}
					
			}
			
			else if((str[i][j]=='T' ||  str[i][j]=='t')
					&& (str[i][j+1]=='E' ||  str[i][j+1]=='e')
					&& (str[i][j+3]=='M' ||  str[i][j+3]=='m')
					) {
				for(int k=0;k<5;k++) {
					newTeemo[i][j+k]='#';				}
					
			}
			
			
			
			}
			
		}
		
	
		/*세로로 찾기*/
		for(int i=0;i<n;i++) {
			for(int j=0;j<=m-5;j++) {
			
				if((str[j+1][i]=='E' ||  str[j+1][i]=='e')
						&& (str[j+2][i]=='E' ||  str[j+2][i]=='e')
						&& (str[j+3][i]=='M' ||  str[j+3][i]=='m')
						) {
					for(int k=0;k<5;k++) {
						newTeemo[j+k][i]='#';				}
						
				}
				
				else if((str[j+1][i]=='E' ||  str[j+1][i]=='e')
						&& (str[j+3][i]=='M' ||  str[j+3][i]=='m')
						&& (str[j+4][i]=='O' ||  str[j+4][i]=='o')
						) {
					for(int k=0;k<5;k++) {
						newTeemo[j+k][i]='#';				}
						
				}
				
				else if((str[j+1][i]=='E' ||  str[j+1][i]=='e')
						&& (str[j+2][i]=='E' ||  str[j+2][i]=='e')
						&& (str[j+4][i]=='O' ||  str[j+4][i]=='o')
						) {
					for(int k=0;k<5;k++) {
						newTeemo[j+k][i]='#';				}
						
				}
				
				else if((str[j][i]=='T' ||  str[j][i]=='t')
						&& (str[j+2][i]=='E' ||  str[j+2][i]=='e')
						&& (str[j+4][i]=='O' ||  str[j+4][i]=='o')
						) {
					for(int k=0;k<5;k++) {
						newTeemo[j+k][i]='#';				}
						
				}
				
				else if((str[j][i]=='T' ||  str[j][i]=='t')
						&& (str[j+2][i]=='E' ||  str[j+2][i]=='e')
						&& (str[j+3][i]=='M' ||  str[j+3][i]=='m')
						) {
					for(int k=0;k<5;k++) {
						newTeemo[j+k][i]='#';				}
						
				}
				
				else if((str[j][i]=='T' ||  str[j][i]=='t')
						&& (str[j+1][i]=='E' ||  str[j+1][i]=='e')
						&& (str[j+3][i]=='M' ||  str[j+3][i]=='m')
						) {
					for(int k=0;k<5;k++) {
						newTeemo[j+k][i]='#';				}
						
				}
				
				
				
				}
				
			}
		
		/*대각선으로 찾기*/
		for(int i=0;i<=m-5;i++) {
			for(int j=0;j<=n-5;j++) {
			
			if((str[i+1][j+1]=='E' ||  str[i+1][j+1]=='e')
					&& (str[i+2][j+2]=='E' ||  str[i+2][j+2]=='e')
					&& (str[i+3][j+3]=='M' ||  str[i+3][j+3]=='m')
					) {
				for(int k=0;k<5;k++) {
					newTeemo[i+k][j+k]='#';				}
					
			}
			
			else if((str[i+1][j+1]=='E' ||  str[i+1][j+1]=='e')
					&& (str[i+3][j+3]=='M' ||  str[i+3][j+3]=='m')
					&& (str[i+4][j+4]=='O' ||  str[i+4][j+4]=='o')
					) {
				for(int k=0;k<5;k++) {
					newTeemo[i+k][j+k]='#';				}
					
			}
			
			else if((str[i+1][j+1]=='E' ||  str[i+1][j+1]=='e')
					&& (str[i+2][j+2]=='E' ||  str[i+2][j+2]=='e')
					&& (str[i+4][j+4]=='O' ||  str[i+4][j+4]=='o')
					) {
				for(int k=0;k<5;k++) {
					newTeemo[i+k][j+k]='#';				}
					
			}
			
			else if((str[i][j]=='T' ||  str[i][j]=='t')
					&& (str[i+2][j+2]=='E' ||  str[i+2][j+2]=='e')
					&& (str[i+4][j+4]=='O' ||  str[i+4][j+4]=='o')
					) {
				for(int k=0;k<5;k++) {
					newTeemo[i+k][j+k]='#';				}
					
			}
			
			else if((str[i][j]=='T' ||  str[i][j]=='t')
					&& (str[i+2][j+2]=='E' ||  str[i+2][j+2]=='e')
					&& (str[i+3][j+3]=='M' ||  str[i+3][j+3]=='m')
					) {
				for(int k=0;k<5;k++) {
					newTeemo[i+k][j+k]='#';				}
					
			}
			
			else if((str[i][j]=='T' ||  str[i][j]=='t')
					&& (str[i+1][j+1]=='E' ||  str[i+1][j+1]=='e')
					&& (str[i+3][j+3]=='M' ||  str[i+4][j+3]=='m')
					) {
				for(int k=0;k<5;k++) {
					newTeemo[i+k][j+k]='#';				}
					
			}
			
			
			
			}
			
		}
		
		/*대각선으로 찾기 /방향 */
		for(int i=m-1;i-4>=0;i--) {
			for(int j=0;j<=n-5;j++) {
			
			if((str[i-1][j+1]=='E' ||  str[i-1][j+1]=='e')
					&& (str[i-2][j+2]=='E' ||  str[i-2][j+2]=='e')
					&& (str[i-3][j+3]=='M' ||  str[i-3][j+3]=='m')
					) {
				for(int k=0;k<5;k++) {
					newTeemo[i-k][j+k]='#';				}
					
			}
			
			else if((str[i-1][j+1]=='E' ||  str[i-1][j+1]=='e')
					&& (str[i-3][j+3]=='M' ||  str[i-3][j+3]=='m')
					&& (str[i-4][j+4]=='O' ||  str[i-4][j+4]=='o')
					) {
				for(int k=0;k<5;k++) {
					newTeemo[i-k][j+k]='#';				}
					
			}
			
			else if((str[i-1][j+1]=='E' ||  str[i-1][j+1]=='e')
					&& (str[i-2][j+2]=='E' ||  str[i-2][j+2]=='e')
					&& (str[i-4][j+4]=='O' ||  str[i-4][j+4]=='o')
					) {
				for(int k=0;k<5;k++) {
					newTeemo[i-k][j+k]='#';				}
					
			}
			
			else if((str[i][j]=='T' ||  str[i][j]=='t')
					&& (str[i-2][j+2]=='E' ||  str[i-2][j+2]=='e')
					&& (str[i-4][j+4]=='O' ||  str[i-4][j+4]=='o')
					) {
				for(int k=0;k<5;k++) {
					newTeemo[i-k][j+k]='#';				}
					
			}
			
			else if((str[i][j]=='T' ||  str[i][j]=='t')
					&& (str[i-2][j+2]=='E' ||  str[i-2][j+2]=='e')
					&& (str[i-3][j+3]=='M' ||  str[i-3][j+3]=='m')
					) {
				for(int k=0;k<5;k++) {
					newTeemo[i-k][j+k]='#';				}
					
			}
			
			else if((str[i][j]=='T' ||  str[i][j]=='t')
					&& (str[i-1][j+1]=='E' ||  str[i-1][j+1]=='e')
					&& (str[i-3][j+3]=='M' ||  str[i-4][j+3]=='m')
					) {
				for(int k=0;k<5;k++) {
					newTeemo[i-k][j+k]='#';				}
					
			}
			
			
			
			}
			
		}
		
		
		/******반대방향 찾기*******/
		
		/*가로로 찾기*/
		for(int i=0;i<m;i++) {
			for(int j=0;j<=n-5;j++) {
			
			if((reverseStr[i][j+1]=='E' ||  reverseStr[i][j+1]=='e')
					&& (reverseStr[i][j+2]=='E' ||  reverseStr[i][j+2]=='e')
					&& (reverseStr[i][j+3]=='M' ||  reverseStr[i][j+3]=='m')
					) {
				for(int k=0;k<5;k++) {
					newTeemo[n-1-i][m-1-(j+k)]='#';				}
					
			}
			
			else if((reverseStr[i][j+1]=='E' ||  reverseStr[i][j+1]=='e')
					&& (reverseStr[i][j+3]=='M' ||  reverseStr[i][j+3]=='m')
					&& (reverseStr[i][j+4]=='O' ||  reverseStr[i][j+4]=='o')
					) {
				for(int k=0;k<5;k++) {
					newTeemo[n-1-i][m-1-(j+k)]='#';				}
					
			}
			
			else if((reverseStr[i][j+1]=='E' ||  reverseStr[i][j+1]=='e')
					&& (reverseStr[i][j+2]=='E' ||  reverseStr[i][j+2]=='e')
					&& (reverseStr[i][j+4]=='O' ||  reverseStr[i][j+4]=='o')
					) {
				for(int k=0;k<5;k++) {
					newTeemo[n-1-i][m-1-(j+k)]='#';				}
					
			}
			
			else if((reverseStr[i][j]=='T' ||  reverseStr[i][j]=='t')
					&& (reverseStr[i][j+2]=='E' ||  reverseStr[i][j+2]=='e')
					&& (reverseStr[i][j+4]=='O' ||  reverseStr[i][j+4]=='o')
					) {
				for(int k=0;k<5;k++) {
					newTeemo[n-1-i][m-1-(j+k)]='#';				}
					
			}
			
			else if((reverseStr[i][j]=='T' ||  reverseStr[i][j]=='t')
					&& (reverseStr[i][j+2]=='E' ||  reverseStr[i][j+2]=='e')
					&& (reverseStr[i][j+3]=='M' ||  reverseStr[i][j+3]=='m')
					) {
				for(int k=0;k<5;k++) {
					newTeemo[n-1-i][m-1-(j+k)]='#';				}
					
			}
			
			else if((reverseStr[i][j]=='T' ||  reverseStr[i][j]=='t')
					&& (reverseStr[i][j+1]=='E' ||  reverseStr[i][j+1]=='e')
					&& (reverseStr[i][j+3]=='M' ||  reverseStr[i][j+3]=='m')
					) {
				for(int k=0;k<5;k++) {
					newTeemo[n-1-i][m-1-(j+k)]='#';				}
					
			}
			
			
			
			}
			
		}
		
	
		/*세로로 찾기*/
		for(int i=0;i<n;i++) {
			for(int j=0;j<=m-5;j++) {
			
				if((reverseStr[j+1][i]=='E' ||  reverseStr[j+1][i]=='e')
						&& (reverseStr[j+2][i]=='E' ||  reverseStr[j+2][i]=='e')
						&& (reverseStr[j+3][i]=='M' ||  reverseStr[j+3][i]=='m')
						) {
					for(int k=0;k<5;k++) {
						newTeemo[m-1-(j+k)][n-1-i]='#';				}
						
				}
				
				else if((reverseStr[j+1][i]=='E' ||  reverseStr[j+1][i]=='e')
						&& (reverseStr[j+3][i]=='M' ||  reverseStr[j+3][i]=='m')
						&& (reverseStr[j+4][i]=='O' ||  reverseStr[j+4][i]=='o')
						) {
					for(int k=0;k<5;k++) {
						newTeemo[m-1-(j+k)][n-1-i]='#';				}
						
				}
				
				else if((reverseStr[j+1][i]=='E' ||  reverseStr[j+1][i]=='e')
						&& (reverseStr[j+2][i]=='E' ||  reverseStr[j+2][i]=='e')
						&& (reverseStr[j+4][i]=='O' ||  reverseStr[j+4][i]=='o')
						) {
					for(int k=0;k<5;k++) {
						newTeemo[m-1-(j+k)][n-1-i]='#';				}
						
				}
				
				else if((reverseStr[j][i]=='T' ||  reverseStr[j][i]=='t')
						&& (reverseStr[j+2][i]=='E' ||  reverseStr[j+2][i]=='e')
						&& (reverseStr[j+4][i]=='O' ||  reverseStr[j+4][i]=='o')
						) {
					for(int k=0;k<5;k++) {
						newTeemo[m-1-(j+k)][n-1-i]='#';				}
						
				}
				
				else if((reverseStr[j][i]=='T' ||  reverseStr[j][i]=='t')
						&& (reverseStr[j+2][i]=='E' ||  reverseStr[j+2][i]=='e')
						&& (reverseStr[j+3][i]=='M' ||  reverseStr[j+3][i]=='m')
						) {
					for(int k=0;k<5;k++) {
						newTeemo[m-1-(j+k)][n-1-i]='#';				}
						
				}
				
				else if((reverseStr[j][i]=='T' ||  reverseStr[j][i]=='t')
						&& (reverseStr[j+1][i]=='E' ||  reverseStr[j+1][i]=='e')
						&& (reverseStr[j+3][i]=='M' ||  reverseStr[j+3][i]=='m')
						) {
					for(int k=0;k<5;k++) {
						newTeemo[m-1-(j+k)][n-1-i]='#';				}
						
				}
				
				
				
				}
				
			}
		
		/*대각선으로 찾기*/
		for(int i=0;i<=m-5;i++) {
			for(int j=0;j<=n-5;j++) {
			
			if((reverseStr[i+1][j+1]=='E' ||  reverseStr[i+1][j+1]=='e')
					&& (reverseStr[i+2][j+2]=='E' ||  reverseStr[i+2][j+2]=='e')
					&& (reverseStr[i+3][j+3]=='M' ||  reverseStr[i+3][j+3]=='m')
					) {
				for(int k=0;k<5;k++) {
					newTeemo[m-1-(i+k)][m-1-(j+k)]='#';				}
					
			}
			
			else if((reverseStr[i+1][j+1]=='E' ||  reverseStr[i][j+1]=='e')
					&& (reverseStr[i+3][j+3]=='M' ||  reverseStr[i+3][j+3]=='m')
					&& (reverseStr[i+4][j+4]=='O' ||  reverseStr[i+4][j+4]=='o')
					) {
				for(int k=0;k<5;k++) {
					newTeemo[m-1-(i+k)][m-1-(j+k)]='#';				}
					
			}
			
			else if((reverseStr[i+1][j+1]=='E' ||  reverseStr[i+1][j+1]=='e')
					&& (reverseStr[i+2][j+2]=='E' ||  reverseStr[i+2][j+2]=='e')
					&& (reverseStr[i+4][j+4]=='O' ||  reverseStr[i+4][j+4]=='o')
					) {
				for(int k=0;k<5;k++) {
					newTeemo[m-1-(i+k)][m-1-(j+k)]='#';				}
					
			}
			
			else if((reverseStr[i][j]=='T' ||  reverseStr[i][j]=='t')
					&& (reverseStr[i+2][j+2]=='E' ||  reverseStr[i+2][j+2]=='e')
					&& (reverseStr[i+4][j+4]=='O' ||  reverseStr[i+4][j+4]=='o')
					) {
				for(int k=0;k<5;k++) {
					newTeemo[m-1-(i+k)][m-1-(j+k)]='#';				}
					
			}
			
			else if((reverseStr[i][j]=='T' ||  reverseStr[i][j]=='t')
					&& (reverseStr[i+2][j+2]=='E' ||  reverseStr[i+2][j+2]=='e')
					&& (reverseStr[i+3][j+3]=='M' ||  reverseStr[i+3][j+3]=='m')
					) {
				for(int k=0;k<5;k++) {
					newTeemo[m-1-(i+k)][m-1-(j+k)]='#';				}
					
			}
			
			else if((reverseStr[i][j]=='T' ||  reverseStr[i][j]=='t')
					&& (reverseStr[i+1][j+1]=='E' ||  reverseStr[i+1][j+1]=='e')
					&& (reverseStr[i+3][j+3]=='M' ||  reverseStr[i+4][j+3]=='m')
					) {
				for(int k=0;k<5;k++) {
					newTeemo[m-1-(i+k)][m-1-(j+k)]='#';				}
					
			}
			
			
			
			}
			
		}
		
		for(int i=m-1;i>n-5;i--) {
			for(int j=0;j<=n-5;j++) {
			
			if((reverseStr[i-1][j+1]=='E' ||  reverseStr[i-1][j+1]=='e')
					&& (reverseStr[i-2][j+2]=='E' ||  reverseStr[i-2][j+2]=='e')
					&& (reverseStr[i-3][j+3]=='M' ||  reverseStr[i-3][j+3]=='m')
					) {
				for(int k=0;k<5;k++) {
					newTeemo[m-1-(i-k)][m-1-(j+k)]='#';				}
					
			}
			
			else if((reverseStr[i-1][j+1]=='E' ||  reverseStr[i-1][j+1]=='e')
					&& (reverseStr[i-3][j+3]=='M' ||  reverseStr[i-3][j+3]=='m')
					&& (reverseStr[i-4][j+4]=='O' ||  reverseStr[i-4][j+4]=='o')
					) {
				for(int k=0;k<5;k++) {
					newTeemo[m-1-(i-k)][m-1-(j+k)]='#';				}
					
			}
			
			else if((reverseStr[i-1][j+1]=='E' ||  reverseStr[i-1][j+1]=='e')
					&& (reverseStr[i-2][j+2]=='E' ||  reverseStr[i-2][j+2]=='e')
					&& (reverseStr[i-4][j+4]=='O' ||  reverseStr[i-4][j+4]=='o')
					) {
				for(int k=0;k<5;k++) {
					newTeemo[m-1-(i-k)][m-1-(j+k)]='#';				}
					
			}
			
			else if((reverseStr[i][j]=='T' ||  reverseStr[i][j]=='t')
					&& (reverseStr[i-2][j+2]=='E' ||  reverseStr[i-2][j+2]=='e')
					&& (reverseStr[i-4][j+4]=='O' ||  reverseStr[i-4][j+4]=='o')
					) {
				for(int k=0;k<5;k++) {
					newTeemo[m-1-(i-k)][m-1-(j+k)]='#';				}
					
			}
			
			else if((reverseStr[i][j]=='T' ||  reverseStr[i][j]=='t')
					&& (reverseStr[i-2][j+2]=='E' ||  reverseStr[i-2][j+2]=='e')
					&& (reverseStr[i-3][j+3]=='M' ||  reverseStr[i-3][j+3]=='m')
					) {
				for(int k=0;k<5;k++) {
					newTeemo[m-1-(i-k)][m-1-(j+k)]='#';				}
					
			}
			
			else if((reverseStr[i][j]=='T' ||  reverseStr[i][j]=='t')
					&& (reverseStr[i-1][j+1]=='E' ||  reverseStr[i-1][j+1]=='e')
					&& (reverseStr[i-3][j+3]=='M' ||  reverseStr[i-4][j+3]=='m')
					) {
				for(int k=0;k<5;k++) {
					newTeemo[m-1-(i-k)][m-1-(j+k)]='#';				}
					
			}
			
			
			
			}
			
		}
		
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(newTeemo[i][j]);
			}
			System.out.println();
		}
		
			return;
		}
	
}
