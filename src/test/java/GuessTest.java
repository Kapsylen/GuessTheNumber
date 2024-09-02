import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import sesv.Guess;

import static org.junit.jupiter.api.Assertions.*;

public class GuessTest {

   static Guess guess;

    @BeforeAll
    static void setup() {
        guess = new Guess();
    }

    @Test
    void whenGuessIsLowerThanCorrectAnswer_shouldReturnLowerAnswer() {
        guess.generateARandomNumberBetweenOneAndOneHundred();
        int guessingNumber = guess.getGeneratedRandomNumber() + 1;
        assertEquals(guess.makeAGuess(guessingNumber), String.format("is lower than: %d", guessingNumber));
    }

    @Test
    void whenGuessIsHigherThanCorrectAnswer_shouldReturnHigherAnswer() {
        guess.generateARandomNumberBetweenOneAndOneHundred();
        int guessingNumber = guess.getGeneratedRandomNumber() -1;
        assertEquals(guess.makeAGuess(guessingNumber), String.format("is higher than: %d", guessingNumber));
    }

    @Test
    void whenAnValidGuess_shouldReturnCorrectMessage() {
        Guess guess = new Guess();
        guess.generateARandomNumberBetweenOneAndOneHundred();
        int guessingNumber = guess.getGeneratedRandomNumber();
        assertEquals(guess.makeAGuess(guessingNumber), String.format("Number: %d was correct!", guessingNumber));
    }
}
