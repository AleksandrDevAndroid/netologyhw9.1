public class CreditAccount extends Account {


    public CreditAccount(String name, long balance, long creditLimit) {
        super(name, balance, creditLimit);
    }

    private long balance = creditLimit;

    @Override
    boolean add(long amount) {
        if (balance + amount <= creditLimit) {
            balance += amount;
            return true;
        }
        return false;
    }

    @Override
    boolean pay(long amount) {
        if (balance - amount >= 0) {
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    boolean transfer(Account account, long amount) {
        if (balance - amount >= 0) {
            account.add(amount);
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public long getBalance() {
        return balance;
    }
}
