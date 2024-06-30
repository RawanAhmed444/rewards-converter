public class RewardValue {
    private static final double CONVERSION_RATE_TO_CASH = 0.0035;
    private final double cashValue;
    private final double milesValue;

    public RewardValue(double cashValue) throws IllegalArgumentException {
        if (cashValue < 0) {
            throw new IllegalArgumentException("Cash value cannot be negative.");
        }
        this.cashValue = cashValue;
        this.milesValue = cashValue / CONVERSION_RATE_TO_CASH;
    }

    public RewardValue(int milesValue) throws IllegalArgumentException {
        if (milesValue < 0) {
            throw new IllegalArgumentException("Miles value cannot be negative.");
        }
        this.milesValue = milesValue;
        this.cashValue = milesValue * CONVERSION_RATE_TO_CASH;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }
}
