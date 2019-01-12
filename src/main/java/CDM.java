public class CDM {

    private int money;
    private int limit;

    public CDM(int money,int limit) {
        this.money = money;
        this.limit = limit;
    }

    int getMoney() {
        return money;
    }

    int receiveMoney(CreditCard creditCard, int amount) {
        if (!creditCard.isValid() || amount < 0|| money+amount >limit) {
            return amount;
        }

        if(creditCard.getAccount().setMoney(amount)) {
            money = money + amount;
            return 0;
        }
        else return amount;

    }

    boolean fillMoney(int amount){
        if( amount < 0) return false;
        else{
            this.money += amount;
            return true;
        }
    }

}