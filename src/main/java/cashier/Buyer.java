package cashier;

public class Buyer  extends Thread {
    
    private Cashier cashier;
    
    public Buyer(Cashier cashier) {
        this.cashier = cashier;
    }
    
    @Override
    public void run() {
        try{
            cashier.completeServiceOfBuyer();
        }catch(InterruptedException e){
            System.out.println("Service Error");
        }
    }
}