package sesv;

public class Guess {

    private int generatedNumber;

    public String guessNumber(int value) {
        if (value == generatedNumber) {
            return String.format("Number: %d was correct!", value);
        } else if (value < generatedNumber) {
            return String.format("is higher than: %d", value);
        } else
            return String.format("is lower than: %d", value);
    }

    public void generateARandomNumberBetweenOneAndOneHundred() {
        generatedNumber = (int) (Math.random() * 100) + 1;
    }

    public int getGeneratedRandomNumber() {
        return generatedNumber;
    }
}
