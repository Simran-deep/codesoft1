//Number game
import java.util.Random; //random number library
import java.util.Scanner; //input library
public class task1 {
    public static int playGame(Scanner scanner) {
        Random random = new Random();
        int attempts = 0; 
//1.1 task generate Random number   
        System.out.println("NUMBER GAME");     
        int a = random.nextInt(100) + 1; //generate number range between 0-100
        int b = random.nextInt(100) + 1;
        int c = random.nextInt(100) + 1;
        System.out.println("1st Random Number: " + a);
        System.out.println("2nd Random Number: " + b);
        System.out.println("3rd Random Number: " + c);
        boolean correctGuess = false;
        System.out.print("MAXIMUM ATTEMPTS THREE ");
//1.5 task limit        
        int maxAttempts = 3;
        int minAttempts = 0; 
        while (minAttempts < maxAttempts) {
            minAttempts++; 
            attempts++;
//1.2 task Prompt the user to enter guesses          
            System.out.print("\nEnter 1st random number: ");
            int A = scanner.nextInt();
            System.out.print("Enter 2nd random number: ");
            int B = scanner.nextInt();
            System.out.print("Enter 3rd random number: ");
            int C = scanner.nextInt();
//1.4 task Check if guesses are correct            
//1.3 Provide feedback on individual guesses                
                if (A == a) {
                    System.out.println("guess for 1st random number is correct!");
                } else if (A < a) {
                    System.out.println("guess for 1st random number is too low.");
                } else {
                    System.out.println("guess for 1st random number is too high.");
                }  
                if (B == b) {
                    System.out.println("guess for 2nd random number is correct!");
                } else if (B < b) {
                    System.out.println("guess for 2nd random number is too low.");
                } else {
                    System.out.println("guess for 2nd random number is too high.");
                }
                if (C == c) {
                    System.out.println("guess for 3rd random number is correct!");
                } else if (C < c) {
                    System.out.println("guess for 3rd random number is too low.");
                } else {
                    System.out.println("guess for 3rd random number is too high.");
                
            }   if (A == a && B == b && C == c) {
                System.out.println("Congratulations! Your guesses are correct!");
                correctGuess = true;
                break;
            } 
        } 
        if (!correctGuess) {
            System.out.println("\nSorry,Reached the maximum number of attempts.Correct numbers are: " + a + ", " + b + ", " + c);
        } 
        return attempts; 
    }
//1.6 and 1.7 to play again the game and display the score
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalAttem = 0; 
        boolean playAgain;
        do {            
            int attem = playGame(scanner); 
            totalAttem += attem; 
            System.out.println("Total Attempts : " + totalAttem); 
            System.out.println("User scores : " + totalAttem); 
            System.out.print("Do you want to play again? (y/n): ");
            String playChoice = scanner.next().toLowerCase();
            playAgain = playChoice.equals("y");
        } while (playAgain);
        System.out.println("Final score: " + totalAttem);
        scanner.close();
    }
}
