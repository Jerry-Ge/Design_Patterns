package ge.jerry;

public class GrabStocks {
    public static void main(String[] args)
    {
        StockGrabber stockGrabber = new StockGrabber();

        StockObserver observer1 = new StockObserver(stockGrabber);
        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setApplePrice(677.60);
        stockGrabber.setGooglePrice(676.40);

        stockGrabber.unregister(observer1);

        StockObserver observer2 = new StockObserver(stockGrabber);
        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setApplePrice(677.60);
        stockGrabber.setGooglePrice(676.40);


        Runnable getIBM = new GetTheStock("IBM", 197.00, stockGrabber, 2);

        Runnable getAAPL = new GetTheStock("AAPL", 677.60, stockGrabber, 2);

        Runnable getGOOG = new GetTheStock("GOOG", 676.40, stockGrabber, 2);

        new Thread(getIBM).start();
        new Thread(getAAPL).start();
        new Thread(getGOOG).start();


    }
}
