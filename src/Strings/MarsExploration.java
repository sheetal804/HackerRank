package Strings;
import java.util.Scanner;

public class MarsExploration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int i=3,c=0;
        for(char ch:s.toCharArray())
        {
        	if((i-1)%3==0)
        	{
        		c+=ch!='O'?1:0;
        	}
        	else if(ch!='S') {
        		c++;
        	}
        	i++;
        }
        System.out.println(c);
        

	}
}