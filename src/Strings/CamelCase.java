package Strings;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CamelCase {

    public static void main(String args[]) {
    	Scanner in = new Scanner(System.in);
        String s = in.next();
        String w="";
        int count=1;
        char ch;
        for(int i=0;i<s.length();i++) {
        	 ch=s.charAt(i);
        	if(ch>=97&&ch<=122)
        		w=w+ch;
        	else
        	{
        		w="";
        		w+=ch;
        		//you can get the words here
        		count++;
        	}
        }
        //another easy option to solve this
        /*int count = 1;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                count++;
            }
        }*/
        System.out.println(count);
}
}