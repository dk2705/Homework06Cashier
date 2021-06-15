package cashier;

public class Cashier {
    
    private int numberOfBuyers = 0;
    
    public synchronized void completeServiceOfBuyer() throws InterruptedException {
        double serviceTime = Math.random()*(10-3)+3;
        long serviceTimeLong = Math.round(serviceTime);
        Thread.sleep(serviceTimeLong*1000);
        numberOfBuyers++;
        System.out.println("Service of Buyer " + numberOfBuyers + " was completed for " + serviceTimeLong + " sec");
    }
    
    public long getNumberOfBuyers() {
        return numberOfBuyers;
    }
}