package cashier;

public class CashierService {
    public static void main(String[] args) throws InterruptedException {
        Cashier cashier = new Cashier();
        for(int i=0; i<5; i++) {
            Buyer buyer = new Buyer(cashier);
            buyer.start();
            buyer.join();
            double flagServiceClose = Math.random();
            if(i<4 && flagServiceClose < 0.5){
                System.out.println("cashbox is closed");
                break;
            }
        }
        
        System.out.println(cashier.getNumberOfBuyers() + " buyers were served");
    }
}