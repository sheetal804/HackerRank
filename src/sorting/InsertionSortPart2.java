package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InsertionSortPart2 {

	public static void insertIntoSorted(int[] ar) {
		String s = ar.toString();
		int l = ar.length, j;

		for(int i=1;i<l;i++) {
			//System.out.println(i);
			Arrays.sort(ar,0,i+1);
			printArray(ar);
			
		}
		/*for (int i = 0; i < l - 1; i++) {
			for (j = 0; j <= i; j++) {
				// System.out.println(ar[j]);
				if (ar[j] > ar[j + 1]) {
					int t = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = t;
				}

			}
			printArray(ar);
		}*/
}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		insertIntoSorted(ar);
	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}
}
