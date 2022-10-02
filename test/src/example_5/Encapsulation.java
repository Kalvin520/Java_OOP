package example_5;

/**
     * @author kalvin
     */
    public class Encapsulation {
        public static void main(String[] args) {
            CashCard[] cards = {
                    new CashCard("A001", 500, 0),
                    new CashCard("A002", 300,  0),
                    new CashCard("A003", 1000, 1),
                    new CashCard("A003", 2000, 2),
                    new CashCard("A003", 3000, 3)
            };

            for (var card : cards){
                System.out.printf("(%s, %d, %d)%n",card.getNumber(),card.getBalance(),card.getBonus());
            }
        }
    }
