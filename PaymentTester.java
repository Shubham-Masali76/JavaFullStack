/* 
    Create an interface Payable with a method 
    processPayment(double amount) that returns a boolean indicating success. 
    Implement this interface in two classes: CreditCardPayment (returns true if amount < 5000) and 
    BankTransferPayment (returns true if amount < 10000). 
    Write a program to test payment processing for different amounts using both implementations.
*/

interface Payable {
    boolean processPayment(double amount);
}

class CreditCardPayment implements Payable {
    public boolean processPayment(double amount) {
        return amount < 5000;
    }
}

class BankTransferPayment implements Payable {
    public boolean processPayment(double amount) {
        return amount < 10000;
    }
}

public class PaymentTester {

    public void testPayments(double amount) {
        Payable cc = new CreditCardPayment();
        Payable bank = new BankTransferPayment();

        System.out.println("Credit Card Payment: " + (cc.processPayment(amount) ? "Success" : "Failed"));
        System.out.println("Bank Transfer Payment: " + (bank.processPayment(amount) ? "Success" : "Failed"));
    }

    public static void main(String[] args) {
        new PaymentTester().testPayments(7000);
    }
}
