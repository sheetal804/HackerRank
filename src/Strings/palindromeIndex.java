package Strings;
import java.util.Scanner;

public class palindromeIndex {

	static int Ispalindrome(String s) {
		int l = s.length();
		// System.out.println(s);
		for (int i = 0; i < s.length() / 2; i++) {
			// System.out.println(s.charAt(i)+" "+s.charAt(l-1-i));
			if (s.charAt(i) != s.charAt(l - i - 1))
				return -1;
		}
		return 1;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			String s = in.next();
			if (Ispalindrome(s) == 1)
				System.out.println(-1);
			else {
				//System.out.println("string " + s);
				int l;
				l = s.length();
				outer:

				for (int i = 1; i <= s.length() / 2; i++) {
					String s1 = s.substring(0, i - 1) + s.substring(i, l);
					String s2 = s.substring(0, l - i) + s.substring(l - i + 1, l);
					if (Ispalindrome(s1) == 1) {
						System.out.println(i);
						break outer;
					} else if (Ispalindrome(s2) == 1) {
						System.out.println(l - i);
						break outer;
					}
				}
			}
		}

	}
}
/*public class Solution {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);



		int T = in.nextInt();

		for (int tc = 0; tc < T; tc++) {

			String str = in.next();

			System.out.println(findRemovalIndex(str));

		}



		in.close();

	}



	static int findRemovalIndex(String str) {

		for (int i = 0, j = str.length() - 1; i < j; i++, j--) {

			if (str.charAt(i) != str.charAt(j)) {

				return isPalindrome(str, i + 1, j) ? i : j;

			}

		}

		return -1;

	}



	static boolean isPalindrome(String str, int beginIndex, int endIndex) {

		for (int i = beginIndex, j = endIndex; i < j; i++, j--) {

			if (str.charAt(i) != str.charAt(j)) {

				return false;

			}

		}

		return true;

	}

}*/