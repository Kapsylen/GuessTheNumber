package sesv;

public class Guess {

    private int generatedNumber;

    public String makeAGuess(int i) {
        if (i == generatedNumber) {
            return String.format("Number: %d was correct!", i);
        } else if (i < generatedNumber) {
            return String.format("is higher than: %d", i);
        } else
            return String.format("is lower than: %d", i);
    }

    public void generateARandomNumberBetweenOneAndOneHundred() {
        generatedNumber = (int) (Math.random() * 100) + 1;
    }

    public int getGeneratedRandomNumber() {
        return generatedNumber;
    }
}
