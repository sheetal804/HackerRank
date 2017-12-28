package sorting;

import java.io.*;
import java.util.*;

public class CountingSort2 {

    public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
        Arrays.parallelSort(ar);
        for(int i = 0;i<s;i++){
            System.out.print(ar[i]+" ");
        }
    }
}