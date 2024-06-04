package pluralsight;


import pluralsight.finance.*;

public class FinanceApplication {
    public static void main(String[] args) {
        Portfolio portfolio = new Portfolio("my portfolio","Manvir");

        BankAccount bankAccount = new BankAccount("Manvir","123",20000);
        portfolio.add(bankAccount);

        House myhouse = new House(2002,10000,4);
        portfolio.add(myhouse);

        Gold mygold = new Gold(100);
        portfolio.add(mygold);

        CreditCard myCreditCard = new CreditCard("Manvir","201",12000);
        portfolio.add(myCreditCard);

        Valuable mostValuableAsset = portfolio.getMostValuable();
        System.out.println("The valuable of the most valuable asset is " + mostValuableAsset.getValue());

        Valuable leastValuabeAsset = portfolio.getLeastValuable();
        System.out.println("The value of the least valuable asset is " + leastValuabeAsset.getValue());

    }
}
