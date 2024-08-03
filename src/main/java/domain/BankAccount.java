package domain;

public class BankAccount {

    private String accountNumber;

    private String owner;

    private double balance;

    private double interestRate;

    private BankAccount(BankAccountBuilder builder){
        this.accountNumber = builder.accountNumber;
        this.owner = builder.owner;
        this.balance = builder.balance;
        this.interestRate = builder.interestRate;
    }

    public static class BankAccountBuilder{

        private String accountNumber;

        private String owner;

        private double balance;

        private double interestRate;

        public BankAccountBuilder(String accountNumber){
            this.accountNumber = accountNumber;
        }

        public BankAccountBuilder withOwner(String owner){
            this.owner = owner;
            return this;
        }

        public BankAccountBuilder withBalance(double balance){
            this.balance = balance;
            return this;
        }

        public BankAccountBuilder withInterest(double interestRate){
            this.interestRate = interestRate;
            return this;
        }

        public BankAccount build(){
            return new BankAccount(this);
        }
    }

    public String toString(){
        return "BankAccount [accountNumber = " + accountNumber + ", owner= " + owner + ", balance=" + balance
        + ", interestRate= " + interestRate + "]";
    }
}
