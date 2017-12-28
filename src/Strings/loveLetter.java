package Strings;
import java.util.Scanner;

public class loveLetter {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		char ch1,ch2;
		for (int a0 = 0; a0 < q; a0++) {
			String s = in.next();
			char s1[]=s.toCharArray();
			int c=0;
			for(int i=0;i<s.length()/2;i++)
			{
				ch1=s.charAt(i);
				int p=s.length()-i-1;
				ch2=s.charAt(p);
				if(ch2>=ch1)
				{
					c=c+ch2-ch1;
					s1[p]=ch1;
				}
                else if(ch1>=ch2)
                {
                    c=c+ch1-ch2;
                    s1[p]=ch2;
                }
			}
			System.out.println(c);
		}
	}
}
