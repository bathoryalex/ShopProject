package shop;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Calendar;

/**
 * Created by bathoryalex on 8/16/2016.
 */
public abstract class Milk extends Food
{
    public final int LITRE = 0;
    public final int HALFLITRE = 0;
    public final int GLASS = 0;
    public final double SKIMMEDMILK = 0;
    public final double SEMISKIMMEDMILK = 0;
    protected long barCode;
    protected int capacity;
    protected String company;
    protected Calendar warrant;
    protected double dripping;

    public Milk(long barCode, int capacity, String company, Calendar warrant, double dripping)
    {
        super(barCode, company, warrant);
        this.capacity = capacity;
        this.dripping = dripping;
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


    @Override
    public String toString()
    {
        return super.toString() + "Dripping:" + dripping;
    }
}
