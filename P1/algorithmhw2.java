package P1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class algorithmhw2 {

	static int data[] = new int[50000]; // 최대 5만개라고 가정

	public static void main(String[] args) {
	
				
				
				
				 int key; // 찾을 키 값
				 int s, b;
				 // 문제의 크기인 n을 1000씩 증가시키면서 다음을 실행
			 for (int n = 1000; n <= 50000; n += 1000) {
					
				int calS[]= new int[500];
				int calB[]= new int[500];
				
				 DataGen(n); // data[]에 n 개의 키 값 생성
				
				 // 동일한 data[]로 key 값을 바꿔가면서 500회 반복
				 for (int i=0; i<500; i++) {
				 key = (int) (Math.random() * n); // 0부터 n 사이의 임의의 key 값 선택
				 s = SequentialSearch(key);//seq. search 알고리즘의 key 비교 회수
				b = BinarySearch(key,n); // bin. search 알고리즘의 key 비교 회수 
				calS[i]=s;
				calB[i]=b;
				
				 
				 // 500회 반복하면서 s, b의 최소, 최대, 평균 값 계산
				
				// s, b의 최소(best), 최대(worst), 평균(average) 값 출력 - 출력함수 구현
				
				 }
				 Printing(calS);
				 Printing(calB);
				 System.out.println();
				}
			 
			 
			 
	}
				public static int SequentialSearch(int key) {
					int count=0; //key 값을 비교한 횟수
					int location=0;
					
					while(location<50000 && data[location]!=key) {
						location++;
						count++;
					}
				return count; //data[]에서 key의 인덱스를 확인할 때까지 key 값들을 비교한 횟수 반환
				}
				
				
				public static int BinarySearch(int key,int n) {
					int low=0,high=n;	
					int mid;
					int location=0,count=0;
					while(low<=high && location==0) {
						mid=(low+high)/2;
						count++;
						if(key==data[mid]) {
							if(mid==0) {
								count++;
								break;
							}
							location=mid;
						}
						else if (key<data[mid]) {
							high=mid-1;
						}
						else {
							low=mid+1;
						}
					
											}
					return count;

					
				 // Algorithm 1.5 또는 2.1를 활용하여 작성
				// ... data[]에서 key의 인덱스를 확인할 때까지 key 값들을 비교한 횟수 반환
				}
				
				private static void DataGen(int n) {
		
					for (int i=0; i < n; i++) { // 아주 단순하게 만들었음
						data[i] = i;}
			

}
					public static void Printing(int[] data) {
						int sum=0;
						Arrays.sort(data);
						for(int i=0;i<data.length;i++) {
							sum += data[i];
						}
						
						System.out.print(data[0]+" ");
						System.out.print(data[data.length-1]+" ");
						System.out.println(+sum/data.length);
						
					}
}
