import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int chances = 0;
            int attempts = 0;
            int randomNum = (int) (Math.random() * 101);

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I'm thinking of a number between 1 and 100.");



            System.out.println("Please select the difficulty level:");
            System.out.println("1. Easy (10 chances)");
            System.out.println("2. Medium (5 chances)");
            System.out.println("3. Hard (3 chances)");
            System.out.println("");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();


            if (choice == 1) {
                chances = 10;
                System.out.println("Great! You have selected the Easy difficulty level.");
            } else if (choice == 2) {
                chances = 5;
                System.out.println("Great! You have selected the Medium difficulty level.");
            } else if (choice == 3) {
                chances = 3;
                System.out.println("Great! You have selected the Hard difficulty level.");
            } else {
                System.out.println("Invalid choice! Defaulting to Medium.");
                chances = 5;
            }

            System.out.println("You have " + chances + " chances to guess the correct number.");
            System.out.println("Let's start the game!");

            boolean won = false;
            while (attempts < chances) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == randomNum) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    won = true;
                    return;
                } else if (guess < randomNum) {
                    System.out.println("Incorrect! The number is greater than " + guess + ".");
                } else {
                    System.out.println("Incorrect! The number is less than " + guess + ".");
                }
            }

            if (!won) {
                System.out.println("Game Over! You ran out of chances. The number was: " + randomNum);
                return;
            }
        }
    }
}