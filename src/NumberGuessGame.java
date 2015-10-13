import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Would you like to play the number guess game? y or n? ");
		if (in.next().equals("y")) {

			// here make a random number assigned to variable
			Random rn = new Random();
			int answer = rn.nextInt(100 - 1 + 1) + 1;
			// this is just a clue for debugging, delete it later
			System.out.println("Clue... " + answer);

			while (true) {
				System.out.println("Please guess an integer between 1 and 100");
				int guess = in.nextInt();
				// here do some logic to check if it equals more or less than
				// the number 1 - 100
				if (guess > answer) {
					System.out.println("Lower");
				}
				if (guess < answer) {
					System.out.println("Higher");
				}
				if (guess == answer) {
					System.out.println("Woo Hoo!! your guess = " + guess + " is correct, answer = " + answer);
					System.out.println("Good bye");
					return;
				}
			}

		} else {
			System.out.println("Good bye");
		}

	}

}
