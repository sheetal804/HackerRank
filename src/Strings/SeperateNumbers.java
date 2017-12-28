package Strings;
import java.util.Scanner;

import javax.swing.text.AbstractDocument.LeafElement;

public class SeperateNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			String s = in.next();
			String s1 = "", s2;
			long n1 = 0;
			int f = 0;
			if (s.length() == 1) {
				System.out.println("NO");
			} else {
				// System.out.println(s);
				int k = 0;
				for (int i = 1; i * 2 <= s.length(); i++) {
					s1 = s1 + s.charAt(i - 1);
					long n = Long.parseLong(s1);
					n1 = n;
					s2 = "";
					// System.out.println(n1+" "+s1);
					while (s2.length() < s.length()) {
						s2 = s2 + n;
						n++;
					}
					// System.out.println("s1="+" "+s1+" "+"s2=:"+s2);
					if (s2.equals(s)) {
						f = 1;
						break;
					}
				}
				if (f == 1)
					System.out.println("YES " + n1);
				else
					System.out.println("NO ");
			}
		}
	}
}
