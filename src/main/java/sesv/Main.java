package sesv;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Guess guess = new Guess();
        guess.generateARandomNumberBetweenOneAndOneHundred();
        String result;
        int userGuess;
        int guessCounter = 0;
        do{
            System.out.println("Guess a number: ");
            guessCounter++;
            userGuess = sc.nextInt();
            sc.nextLine();
            result = guess.makeAGuess(userGuess);
            System.out.println(result);
        } while(!result.equals(String.format("Number: %d was correct!", userGuess)));
        System.out.println(String.format("You guessed correct in: : %d attempts. ", guessCounter));
    }
}