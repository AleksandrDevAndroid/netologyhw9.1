//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CreditAccount user0 = new CreditAccount("Aleks", 0, 300_000);
        CreditAccount user1 = new CreditAccount("Anna", 0, 300_000);
        SimpleAccount user2 = new SimpleAccount("Misha", 30000, 0);
        SimpleAccount user3 = new SimpleAccount("Andrey", 0, 0);

        System.out.println(user1.add(1));
        System.out.println(user1.transfer(user2, 300_000));
        System.out.println(user1.add(300_000));
        System.out.println(user1.getBalance());
        System.out.println(user2.getBalance());

        System.out.println(user2.pay(100_000));
        System.out.println(user2.getBalance());
        System.out.println(user2.transfer(user3, 230_000));
        System.out.println(user2.getBalance());
        System.out.println(user3.getBalance());

    }
}