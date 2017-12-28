package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class CountingSort4 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		int[] frequencies = new int[100];
		StringBuilder STDOUTT = new StringBuilder("");
		Map<Integer, Queue<StringBuilder>> order = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String[] tmp = in.readLine().split(" ");
			int num = Integer.parseInt(tmp[0]);
			StringBuilder s = new StringBuilder(tmp[1]);
			if (i < n / 2)
				System.out.println();
		}
	}
}