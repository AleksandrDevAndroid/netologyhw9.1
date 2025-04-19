public abstract class Account implements Operation {
    protected String name;
    protected long balance;
    protected long creditLimit;

    public Account(String name, long amount, long creditLimit) {
        this.name = name;
        this.balance = amount;
        this.creditLimit = creditLimit;
    }

    abstract boolean add(long amount);

    abstract boolean pay(long amount);

    abstract boolean transfer(Account account, long amount);
}
