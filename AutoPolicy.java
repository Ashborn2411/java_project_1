public class AutoPolicy {
    private int accountNumber;
    private String makeAndModel;
    private String state;

    public AutoPolicy(int accountNumber, String makeAndModel, String state) {
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    // Predicate method returns whether the state has no-fault insurance
    public boolean isNoFaultState() {
        return switch (state) {
            case "MA", "NJ", "NY", "PA", "KY", "MI" -> true;
            default -> false;
        };
    }
}
