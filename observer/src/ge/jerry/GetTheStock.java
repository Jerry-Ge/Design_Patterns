package ge.jerry;

import java.text.DecimalFormat;

public class GetTheStock implements Runnable {
    private int startTime;
    private String stock;
    private double price;

    private Subject stockGrabber;

    public GetTheStock(String stock, double price, Subject stockGrabber
                        , int newStartTime) {
        this.startTime = newStartTime;
        this.stock = stock;
        this.price = price;
        this.stockGrabber = stockGrabber;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 20; ++i)
        {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            double randNum = (Math.random() * (0.06) - 0.03);
            DecimalFormat df = new DecimalFormat("#.##");
            price = Double.valueOf(df.format(price + randNum));

            if(stock == "IBM") ((StockGrabber) stockGrabber).setIBMPrice(price);

            if(stock == "AAPL") ((StockGrabber) stockGrabber).setIBMPrice(price);

            if(stock == "GOOG") ((StockGrabber) stockGrabber).setIBMPrice(price);

            System.out.println(stock + ": " + df.format((price + randNum)) +
                    " " + df.format(randNum));

            System.out.println();
        }
    }
}
