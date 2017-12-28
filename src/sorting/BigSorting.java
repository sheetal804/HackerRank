package sorting;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class BigSorting {

	    public static void main(String[] args) 
	    {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        String[] unsorted = new String[n];
	        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
	            unsorted[unsorted_i] = in.next();
	        }
	        // your code goes here
	        int pos;
	        for(int i=0;i<n;i++) {
	        	pos=i;
	        	BigInteger ib,jb;
	        	for(int j = i+1;j<n;j++) {
	        		 ib=new BigInteger(unsorted[pos]);
	        		 jb=new BigInteger(unsorted[j]);
	        		//System.out.println(ib+"   "+jb);
	        		if(ib.compareTo(jb)<0)
	        		{
	        		//	System.out.println(ib+"ijjj     "+jb);
	        			pos=j;
	        		}
	        	}
	        	//System.out.println(unsorted[i]+"    "+unsorted[pos]);
	        	String t;
	        	t=unsorted[i];
	        	unsorted[i]=unsorted[pos];
	        	unsorted[pos]=t;
	        	//System.out.println(i+"  "+pos+" "+unsorted[i]+" "+unsorted[pos]);
	        	}
	        //System.out.println("Sorted Array");
	        for(int unsorted_i=n-1; unsorted_i >=0; unsorted_i--){
	           System.out.println(unsorted[unsorted_i]);
	        }
	        }
	    }

