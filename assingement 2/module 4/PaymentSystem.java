interface Payment {
    void pay();
}

class CreditCardPayment implements Payment {
    public void pay() {
        System.out.println("Paying with Credit Card");
    }
}

class UPIPayment implements Payment {
    public void pay() {
        System.out.println("Paying with UPI");
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        CreditCardPayment c = new CreditCardPayment();
        c.pay();
        
        UPIPayment u = new UPIPayment();
        u.pay();
    }
}
