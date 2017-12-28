package Strings;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SuperReducedString {

    public static void main(String args[]) {
    	Scanner in = new Scanner(System.in);
        String s = in.next();
    	char ch;
       Stack<Character> st=new Stack<>();
       for(int i = 0;i<s.length();i++) {
    	   ch=s.charAt(i);
    	   if(!st.isEmpty()&&ch==st.peek())
    		   st.pop();
    	   else
    		   st.push(ch);
       }
       if(st.isEmpty())
    	   System.out.print("Empty String");
       else
       {
    	   for(char ch1:st) {
    		   System.out.print(ch1);
    	   }
       }
    }
}
       
