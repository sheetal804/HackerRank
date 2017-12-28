package Strings;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WeightedString {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
		String s = in.next();
		int findCount[] = new int[27];
		HashSet<Integer> hs = new HashSet<>();
		for (int i = 0; i < 26; i++) {
			findCount[i] = 0;
		}
		for (char ch : s.toCharArray()) {
			if (ch >= 'a' && ch <= 'z') {
				int c = ch - 96;
				findCount[c] += c;
				hs.add(findCount[c]);

			}
		}
		int n = in.nextInt();
		System.out.println(n);
		FileWriter fw = new FileWriter("E:\\Sheetal_Backup\\HackerRank\\HackerRank\\src\\c2.csv");
		for (int a0 = 1; a0 <= n; a0++) {
			int x = in.nextInt();
			if (hs.contains(x) == true) {
				fw.write("Yes\n");
				System.out.println(a0 + " " + "Yes");
			} else {
				fw.write("No\n");
				System.out.println(a0 + " " + "No");
			}
		}
	}

}
