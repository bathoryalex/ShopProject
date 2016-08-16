package shop;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Calendar;

/**
 * Created by bathoryalex on 8/16/2016.
 */
public class Milk
{
    private long barCode;
    private final int LITRE = 0;
    private final int HALFLITRE = 0;
    private final int GLASS = 0;
    private final double SKIMMEDMILK = 0;
    private final double SEMISKIMMEDMILK = 0;
    private int capacity;
    private String company;
    private Calendar warrant;
    private double dripping;
    private long price;

    public Milk(long barCode, int capacity, String company, Calendar warrant, double dripping, long price)
    {
        this.barCode = barCode;
        this.capacity = capacity;
        this.company = company;
        this.warrant = warrant;
        this.dripping = dripping;
        this.price = price;
    }

    public long getBarCode()
    {
        return barCode;
    }

    public boolean stillGood()
    {
        throw new NotImplementedException();
    }

    public int getCapacity()
    {
        return capacity;
    }

    public String getCompany()
    {
        return company;
    }

    public Calendar getWarrant()
    {
        return warrant;
    }

    public double getDripping()
    {
        return dripping;
    }

    public long getPrice()
    {
        return price;
    }

    @Override
    public String toString()
    {
        return "Milk{" +
                "capacity=" + capacity +
                ", company='" + company +
                ", warrant=" + warrant +
                ", dripping=" + dripping +
                ", price=" + price +
                '}';
    }
}
