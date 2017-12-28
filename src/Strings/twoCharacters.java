package Strings;
import java.util.Scanner;

public class twoCharacters {

    public static void main(String args[]) {
    	Scanner in = new Scanner(System.in);
    	int l=in.nextInt();
        String s = in.next();
        int i,j,c=0;
        int c1=0;
        char ch,ch1,ch3;
        //System.out.println(s);
        if(s.length()==1)
        {
        	System.out.println(c1);
        	System.exit(0);
        }
        for(i=0;i<26;i++) {
        	inner:
        	for(j=i+1;j<26;j++) {
        		
        		ch=(char) ('a'+i);
        		ch1 = (char) ('a'+j);
        		ch3='\u0000';
        		c=0;
        		for(Character ch2:s.toCharArray()) {
        			if(ch2==ch||ch2==ch1)
        			{
        				if(ch2==ch3)
        				continue inner;
        				c++;
            			ch3=ch2;
        			}
        			
        		}
        		c1=c>c1?c:c1;
        	}
        }
        System.out.println(c1);
    }
}
