package P1;

import java.util.Scanner;

public class week5p3 {
	
	static char ansWord[] = new char[26];  //0-a 1-b ...z까지 저장한다고 생각 a-ascii=97 
	
	static char invWord[] = new char[26];
 public static void main(String args[]) {
	 
	 for(int i =0;i<26;i++) {
			ansWord[i]=' ';
			invWord[i]=' ';
		}
	 
	 Scanner input = new Scanner(System.in);
	 
	 String fox = input.nextLine();
	 String origin = "the quick brown fox jumps over the lazy dog";
	              
	 for(int i=0;i<fox.length();i++) {
		 if((fox.charAt(i)!='?') && (fox.charAt(i)!=' ')) {
			ansWord[(int)origin.charAt(i)-97]=fox.charAt(i);
			invWord[(int)fox.charAt(i)-97]=origin.charAt(i);
		 }
		 
	 }
	 
	 int wordNum = input.nextInt();
	String testString[]=new String[wordNum]; 
	String goodString[]=new String[wordNum]; 
	
	 for(int i=0;i<wordNum;i++) {
		 testString[i]=input.next();
	 }
	 
	 for(int i=0;i<wordNum;i++) {
		 goodString[i]=input.next();
	 }
	 
	 sortingArray(testString);
	 sortingArray(goodString);
//	printStringArray(testString);
//	printStringArray(goodString);
	
	 
	 int count[] = new int[10];
	 
	 for(int i=0;i<testString.length;i++) {
		count[testString[i].length()]++;
	 }
	 

	 for(int i=0;i<testString.length;i++) {
		 if(count[testString[i].length()]==1) {
			 insert(testString[i],goodString[i]);
		 }
	 }
	 
	 for(int i=0;i<testString.length;i++) {
		 for(int j=0;j<testString.length;j++) {
		 if(count[testString[i].length()]!=1 && testString[i].length() == goodString[j].length()) {
			 insert(testString[i],goodString[j]);
			// System.out.println("---insert---");
			// System.out.println(testString[i]+"->"+goodString[j]);
			// printArray(ansWord);
			// System.out.println();
			// printArray(invWord);
			 
			 if(!search()) {
				 
				 backtrack(testString[i],goodString[j]);
			 }
			 
			 else {
				goodString[j]=" "; 
				j=0;
				 
				 break;
			 }
		 }
	 }}
	 
	// printArray(ansWord);
	// System.out.println();
	// printArray(invWord);
	 
	 
		 
	 
  
	 printFox();
	 
 
 }
 	public static void insert(String test,String good) {
 		for(int i=0;i<test.length();i++){
 			ansWord[(int)(test.charAt(i))-97]=good.charAt(i);
 			invWord[(int)(good.charAt(i))-97]=test.charAt(i);
 		}
 		
 		
 		
 		
 	}public static void backtrack(String test,String good) {
 	 		for(int i=0;i<test.length();i++){
 	 			ansWord[(int)(test.charAt(i))-97]=' ';
 	 			invWord[(int)(good.charAt(i))-97]=' ';
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
 
 public static void printArray(char[] c) {
	 for(int i=0;i<c.length;i++) {
		 System.out.println((char)(i+97)+": "+c[i]);
	 }
 }
 
 public static void printStringArray(String[] s) {
	 for(int i=0;i<s.length;i++) {
		 System.out.print(s[i]+" ");
		 
	 }
	 System.out.println();
 }
 
 
 public static void printFox() {
	 System.out.print(ansWord[(int)'t'-97]);
	 System.out.print(ansWord[(int)'h'-97]);
	 System.out.print(ansWord[(int)'e'-97]+" ");
	 
	 System.out.print(ansWord[(int)'q'-97]);
	 System.out.print(ansWord[(int)'u'-97]);
	 System.out.print(ansWord[(int)'i'-97]);
	 System.out.print(ansWord[(int)'c'-97]);
	 System.out.print(ansWord[(int)'k'-97]+" ");
	 
	 System.out.print(ansWord[(int)'b'-97]);
	 System.out.print(ansWord[(int)'r'-97]);
	 System.out.print(ansWord[(int)'o'-97]);
	 System.out.print(ansWord[(int)'w'-97]);
	 System.out.print(ansWord[(int)'n'-97]+" ");
	 
	 System.out.print(ansWord[(int)'f'-97]);
	 System.out.print(ansWord[(int)'o'-97]);
	 System.out.print(ansWord[(int)'x'-97]+" ");
	 
	 System.out.print(ansWord[(int)'j'-97]);
	 System.out.print(ansWord[(int)'u'-97]);
	 System.out.print(ansWord[(int)'m'-97]);
	 System.out.print(ansWord[(int)'p'-97]);
	 System.out.print(ansWord[(int)'s'-97]+" ");
	 
	 System.out.print(ansWord[(int)'o'-97]); 
	 System.out.print(ansWord[(int)'v'-97]);
	 System.out.print(ansWord[(int)'e'-97]);
	 System.out.print(ansWord[(int)'r'-97]+" ");
	 
	 System.out.print(ansWord[(int)'t'-97]);
	 System.out.print(ansWord[(int)'h'-97]);
	 System.out.print(ansWord[(int)'e'-97]+" ");
	 
	 System.out.print(ansWord[(int)'l'-97]); 
	 System.out.print(ansWord[(int)'a'-97]);
	 System.out.print(ansWord[(int)'z'-97]);
	 System.out.print(ansWord[(int)'y'-97]+" ");
	 
	 System.out.print(ansWord[(int)'d'-97]);
	 System.out.print(ansWord[(int)'o'-97]);
	 System.out.print(ansWord[(int)'g'-97]+" ");
	 
	 
	 
	 
	 
	 
	 
 }
 
 public static boolean search() {
	
	 
	 for(int i=0;i<ansWord.length;i++) { 
		 int count1=0;
		 for(int j=0;j<i;j++) {
			 if(ansWord[i]==ansWord[j] && i!=j && ansWord[i]!=' ') {
				 count1++;
			 }
		 }
		 
		 if (count1>=1) {
		//	 System.out.println("ans error");
			 return false;
		 }
	 }
	 
	 for(int i=0;i<invWord.length;i++) { 
		 int count2=0;
		 for(int j=0;j<i;j++) {
			 if(invWord[i]==invWord[j] && i!=j && invWord[i]!=' ' && invWord[j]!=' ') {
				 count2++;
				// System.out.println("i:"+i +"j:"+j);
				// System.out.println(invWord[i]+" "+invWord[j]);
			 }
		 }
		 
		 if (count2>=1) {
			// System.out.println("inv error count2:"+count2);
			 return false;
		 }
	 }
	return true;
	 
	 
	 
	 
 }
 
}
