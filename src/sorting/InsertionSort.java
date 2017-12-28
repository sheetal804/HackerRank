package sorting;

import java.util.Scanner;

public class InsertionSort {

	   public static void insertIntoSorted(int[] ar) {
		   int l=ar.length,j;
		   for(int i=0;i<l;i++) {
			   for(j=l-1-i;j>0;j--) {
				  // System.out.println(ar[j-1]+" "+ar[j]);
				   if(ar[j]<ar[j-1]) {
					   int t=ar[j];
					   ar[j]=ar[j-1];
					   printArray(ar);
					   ar[j-1]=t;
				   }
			   }
		   }
		   printArray(ar);
	    }
	     public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int s = in.nextInt();
	        int[] ar = new int[s];
	         for(int i=0;i<s;i++){
	            ar[i]=in.nextInt(); 
	         }
	         insertIntoSorted(ar);
	    }	    
	    private static void printArray(int[] ar) {
	      for(int n: ar){
	         System.out.print(n+" ");
	      }
	        System.out.println("");
	   }
}
