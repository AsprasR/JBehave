public class ATM {

    private int money;

    public ATM(int money) {
        this.money = money;
    }

    int getMoney() {
        return money;
    }

    int requestMoney(CreditCard creditCard, int amount) {
        if (!creditCard.isValid() || amount > money) {
            return 0;
        }

        amount = creditCard.getAccount().getMoney(amount);

        money = money - amount;

        return amount;
    }

    boolean fillMoney(int amount){
        if( amount < 0) return false;
        else{
            this.money += amount;
            return true;
        }
    }

}