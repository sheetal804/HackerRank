package Try;
import java.io.*;
import java.util.*;

public class TryMethod {

	public static void main(String[] args) {
		// /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		// class should be named Solution. */
		// Scanner input = new Scanner(System.in);
		// String s = input.nextLine();
		//
		// String[] alphabet = new String[]{"A","B","C","D","E",
		// "F","G","H","I","J",
		// "K","L","M","N","O",
		// "P","Q","R","S","T",
		// "U","V","W","X","Y","Z"};
		// Set<String> pangramTracker = new HashSet<>(Arrays.asList(alphabet));
		//
		// for(char letter : s.toCharArray())
		// {
		// if(pangramTracker.contains(Character.toString(letter).toUpperCase()))
		// {
		// pangramTracker.remove(Character.toString(letter).toUpperCase());
		// }
		//
		// if(pangramTracker.isEmpty())//Our tracker is empty meaning we have see every
		// letter
		// {
		// System.out.println("pangram");
		// System.exit(0);
		// }
		// }
		//
		// //We never saw every letter of the alphabet
		// System.out.println("not pangram");

		// Build a set of weights
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int n = in.nextInt();
		Set<Integer> weights = new HashSet<>();

		int currentWeight = 0;
		char prevLetter = ' ';
		for (char letter : s.toCharArray()) {
			if (letter != prevLetter)
				currentWeight = letter - 'a' + 1;
			else
				currentWeight += letter - 'a' + 1;

			prevLetter = letter;
			weights.add(currentWeight);
		}

		for (int a0 = 0; a0 < n; a0++) {
			int x = in.nextInt();

			if (weights.contains(x))
				System.out.println("Yes");
			else
				System.out.println("No");

		}
	}
}