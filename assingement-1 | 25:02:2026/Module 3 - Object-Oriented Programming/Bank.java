class BankAccount {
    private double bal;
    
    public void deposit(double a) {
        bal = bal + a;
    }
    
    public void withdraw(double a) {
        if (a <= bal) {
            bal = bal - a;
        }
    }
    
    public void check() {
        System.out.println(bal);
    }
}

public class Bank {
    public static void main(String[] args) {
        BankAccount a = new BankAccount();
        a.deposit(500);
        a.withdraw(200);
        a.check();
    }
}
