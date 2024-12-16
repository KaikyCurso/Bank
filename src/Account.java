public class Account {
    private final String ACCOUNT_NUMBER;
    private String holder;
    private double balance;
    private static final double WITHDRAW_MONEY_TAX = 5.00;


    public Account(String account_number, String holder, double initialBalance){
        this.ACCOUNT_NUMBER = account_number;
        this.holder = holder;
        this.balance = initialBalance;
    }

    public Account(String account_number, String holder){
        this(account_number, holder, 0);
    }

    public String getHolder() {
        return holder;
    }
    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void withdrawMoney(double value){
        value += WITHDRAW_MONEY_TAX;
        this.balance -= (value + WITHDRAW_MONEY_TAX);;
    }

    public void deposit(double value){
        if (value < 1){
            System.out.println("Invalid value");
            return;
        }
        this.balance += value;
    }

    @Override
    public String toString() {
        return "Account data:\n" +
                "Account: " + ACCOUNT_NUMBER +
                ", Holder: " + holder +
                ", Balance: $" + String.format("2%.f", balance);
    }
}
