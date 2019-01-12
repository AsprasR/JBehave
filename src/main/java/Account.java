public class Account {

    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    int getBalance() {
        return balance;
    }

    int getMoney(int amount) {
        if (balance < amount)
            return 0;

        balance = balance - amount;

        return amount;

    }

    boolean setMoney(int money){
        balance = balance+money;
        return true;
    }
}