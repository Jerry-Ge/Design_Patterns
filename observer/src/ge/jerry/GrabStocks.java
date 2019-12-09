package ge.jerry;

public class GrabStocks {
    public static void main(String[] args)
    {
        StockGrabber stockGrabber = new StockGrabber();

        StockObserver observer1 = new StockObserver(stockGrabber);
        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setApplePrice(677.60);
        stockGrabber.setGooglePrice(676.40);


        StockObserver observer2 = new StockObserver(stockGrabber);
        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setApplePrice(677.60);
        stockGrabber.setGooglePrice(676.40);
    }
}
