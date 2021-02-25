import java.util.Scanner;

class Main {

	static void game(int max) {
		
		int number = (int)(Math.random() * max); // number generated

		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("A number from 0 to " + max + " has been generated.\n");
			System.out.println("Guess the number:");
    		int guess = in.nextInt(); // users guess

			// matches for guess to number
			if (guess == number) { // out of bounds
				// cleaning the terminal
				System.out.print("\033[H\033[2J");  
				System.out.flush();

				System.out.println("You have guessed correctly!");
				break;
			} else {
				if (guess > max || guess < 1) { // 
					// cleaning the terminal
					System.out.print("\033[H\033[2J");  
					System.out.flush();

					System.out.println("You are out of bounds try again!");
					continue;
				} else if (guess > number) {
					// cleaning the terminal
					System.out.print("\033[H\033[2J");  
					System.out.flush();

					System.out.println("Guess Lower!!");
					continue;
				} else if (guess < number) {
					// cleaning the terminal
					System.out.print("\033[H\033[2J");  
					System.out.flush();

					System.out.println("Guess Higher!!");
					continue;
				}
			}

			in.close();
		}

	}

	public static void main(String args[]) {
		// cleaning the terminal
		System.out.print("\033[H\033[2J");  
		System.out.flush();

		// variables for difficulty of game
		String difficulty;
		String easy = "EASY";
		String medium = "MEDIUM";
		String hard = "HARD";

		Scanner in = new Scanner(System.in);

		// title
		System.out.println("Welcome to Number Guessing Game :");
		System.out.println("Choose a difficulty (EASY/MEDIUM/HARD):");
		difficulty = in.nextLine(); //input for difficulty
		difficulty = difficulty.toUpperCase();

		// cleaning the terminal
		System.out.print("\033[H\033[2J");  
		System.out.flush();

		//for each difficulty separate functions
		if (difficulty.equals(easy)) {
			game(10); // easy game
		} else if (difficulty.equals(medium)) {
			game(25); // medium game
		} else if (difficulty.equals(hard)) {
			game(50); // hard game
		}

		in.close();
	}
}