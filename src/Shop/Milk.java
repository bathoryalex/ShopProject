package shop;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Calendar;

/**
 * Created by bathoryalex on 8/16/2016.
 */
public class Milk
{
    private int capacity;
    private String company;
    private Calendar warrant;
    private double dripping;
    private long price;

    public Milk(int capacity, String company, Calendar warrant, double dripping, long price)
    {
        this.capacity = capacity;
        this.company = company;
        this.warrant = warrant;
        this.dripping = dripping;
        this.price = price;
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
