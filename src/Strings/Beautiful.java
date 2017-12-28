package Strings;

import java.util.Scanner;

public class Beautiful {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.nextLine();
		String s = input.nextLine();
		int i, p = -1, c = 0;
		String s1;
		for (i = 0; i < s.length() - 2; i++)
		{
			if (s.charAt(i) == '0' && s.charAt(i + 1) == '1' && s.charAt(i + 2) == '0')
			{
				c++;
				i += 2;
			}
		}
			System.out.println(c);
		}
	}
