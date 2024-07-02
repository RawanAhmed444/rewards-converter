public class RewardValue {
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;
    private final double cashValue;

    //If th value was already cash then the constructor will accept it as it is
    public RewardValue(double cashValue) throws IllegalArgumentException {
        if (cashValue < 0) {
            throw new IllegalArgumentException("Cash value cannot be negative.");
        }
        this.cashValue = cashValue;
    }

    //If it was in miles then the constructor will convert it to cash
    public RewardValue(int milesValue) throws IllegalArgumentException {
        if (milesValue < 0) {
            throw new IllegalArgumentException("Miles value cannot be negative.");
        }
        this.cashValue = convertToCash(milesValue);
    }

    //Converting from miles to cash
    private static double convertToCash(int milesValue) {
        return milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    //Converting from cash to miles
    private static double convertToMiles(double cashValue) {
        return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return convertToMiles(this.cashValue);
    }
}
