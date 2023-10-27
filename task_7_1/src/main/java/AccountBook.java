public class AccountBook {
    private String accountName;
    private double income;
    private double outcome;
    
    public AccountBook() {
        this.accountName = "";
        this.income = 0.0;
        this.outcome = 0.0;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        if (income >= 0) {
            this.income = income;
        } else {
            System.out.println("Income cannot be negative.");
        }
    }

    public double getOutcome() {
        return outcome;
    }

    public void setOutcome(double outcome) {
        if (outcome >= 0) {
            this.outcome = outcome;
        } else {
            System.out.println("Outcome cannot be negative.");
        }
    }

    public double compute() {
        return income - outcome;
    }
}
