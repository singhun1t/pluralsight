package com.pluralsight;

import com.pluralsight.finance.BankAccount;
import com.pluralsight.interfaces.Valuable;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Pam", "234", 12500);
        Valuable account2 = new BankAccount("Joe", "352", 1500);
// try to deposit money into both accounts
        account1.deposit(100);
        ((BankAccount)account2).deposit(100);
        //Class casted Interface variable
    }
}
