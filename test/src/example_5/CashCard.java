package example_5;

/**
 * @author kalvin
 */
public class CashCard {
    private String number;
    private int balance;
    private int bonus;

    public CashCard(String number, int balance, int bonus) {
        this.number = number;
        this.balance = balance;
        this.bonus = bonus;
    }

    void store(int money){//儲值時呼叫
        if (money > 0){
            this.balance += money;
            if (money >= 1000){
                this.bonus++;
            }
        }
        else {
            System.out.println("輸入金額錯誤,請重新輸入儲值金額");
        }
    }

    void charge(int money){//扣款呼叫
        if (money > 0){
            if (money <= this.balance){
                this.balance -= money;
            }
            else {
                System.out.println("錢不夠唷！");
            }
        }
        else {
            System.out.println("目前無餘額，需要儲值");
        }
    }
    int exchange(int bonus){//兌換紅利點數扣點用呼叫
        if (bonus > 0){
            this.bonus -= bonus;
        }
        return this.bonus;
    }

    int getBalance(){
        return balance;
    }

    int getBonus(){
        return bonus;
    }

    String getNumber(){
        return number;
    }
}
