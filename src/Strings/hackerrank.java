package Strings;
import java.util.Scanner;

public class hackerrank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int testcase = in.nextInt();
        int p0=-1,p1=-1,p2=-1;
        int p3=-1,p4=-1,p5=-1,p6=-1,p7=-1,p8=-1,p9=-1;
        //System.out.println(testcase);
        
        for(int i=1;i<=testcase;i++){
            String s = in.next();
            //System.out.println(s);
            p0=s.indexOf('h');
            p1=s.indexOf('a', p0);
            p2=s.indexOf('c', p1+1);
            p3=s.indexOf('k', p2+1);
            p4=s.indexOf('e', p3+1);
            p5=s.indexOf('r', p4+1);
            p6=s.indexOf('r', p5+1);
            p7=s.indexOf('a', p6+1);
            p8=s.indexOf('n', p7+1);
            p9=s.indexOf('k', p8+1);
            if(p1==-1||p2==-1||p3==-1||p4==-1||p5==-1||p6==-1||p7==-1||p8==-1||p9==-1||p0==-1)
            	System.out.println("NO");
            else
            	System.out.println("YES");
            //System.out.println(i);
        }
	}

}
