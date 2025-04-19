public class SimpleAccount extends Account {

    public SimpleAccount(String name, long balance, long creditLimit) {
        super(name, balance, creditLimit);
    }

    long personalScore = balance;

    @Override
    boolean add(long amount) {
        return personalScore != (personalScore += amount) ? true : false;
    }

    @Override
    boolean pay(long amount) {
        if (personalScore - amount >= 0) {
            personalScore -= amount;
            return true;
        }
        return false;
    }

    @Override
    boolean transfer(Account account, long amount) {
        if (personalScore - amount >= 0) {
            account.add(amount);
            personalScore -= amount;
            return true;
        }
        return false;
    }

    @Override
    public long getBalance() {
        return personalScore;
    }
}
