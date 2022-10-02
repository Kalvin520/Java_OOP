package example_5;
import java.util.Scanner;

public class Encapsulation2 {
    public static void main(String[] args) {
        //
        var scanner = new Scanner(System.in);
        var card1 = new CashCard("A001",500,0);
        card1.store(scanner.nextInt());

        var card2 = new CashCard("A002",300,0);
        card2.store(scanner.nextInt());

        var card3 = new CashCard("A003",1000,1);
        card3.store(scanner.nextInt());
        //
        CashCard[] cards = {
                new CashCard("A001",500,0),
                new CashCard("A002",300,0),
                new CashCard("A003",1000,1)
        };

        Scanner console = new Scanner(System.in);
        for (CashCard card : cards){
            System.out.printf("為(%s, %d, %d)儲值:",card.getNumber(),card.getBalance(),card.getBonus());
            card.store(console.nextInt());
            System.out.printf("明細(%s, %d, %d)%n",card.getNumber(),card.getBalance(),card.getBonus());
        }
    }
}
