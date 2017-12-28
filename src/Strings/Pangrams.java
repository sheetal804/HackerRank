package Strings;
import java.util.Scanner;

public class Pangrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] find="abcdefghijklmnopqrstuvwxyz".toCharArray();
		int findCount[]=new int[26];
		for(int i=0;i<26;i++)
		 {
			findCount[i]=0;
			//System.out.println(findCount[i]);
		 }
		Scanner in = new Scanner(System.in);
		 String s = in.nextLine();
		 int len=s.length();
		 int f=0,i;
		 s=s.toLowerCase();
		 if(s.length()<=26)
		 {
			 System.out.println("not pangram");
		 }
		 else
		 {
			 for (char ch:s.toCharArray())
			 {
				 if(ch>='a'&&ch<='z') {
				 int c=ch-97;				
				 findCount[c]++;
				 }
				 
				 
				 
			 }
			 for(i=0;i<26;i++)
			 {
				 if(findCount[i]==0)
					 {
					 f=1;
					 break;
					
					 }
			 }
			 if(f==1)
				 System.out.println("not pangram");
			 else
				 System.out.println("pangram");
		 }
	}

}
