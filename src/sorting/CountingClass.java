package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class CountingClass {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         int arr[]=new int[100];
         Arrays.sort(ar);
         int k=0;
         for(int i=0;k<s;) {
        	// System.out.println("i= "+i+" ar[k]= "+ar[k]);
        	 if(ar[k]==i) {
        		 arr[i]++;
        		 k++;
        		
        	 }
        	 else
        	 i++;
        	 
         }
         for(int i=0;i<100;i++)
         {
        	 System.out.print(arr[i]);
         }
	}
}
