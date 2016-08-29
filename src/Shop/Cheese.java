package shop;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Calendar;

/**
 * Created by bathoryalex on 16/08/29.
 */
public class Cheese
{
    protected double weight;
    protected double dripping;
    protected long barCode;
    protected long company;
    protected Calendar warrant;

    public Cheese(double weight, double dripping, long barCode, long company, Calendar warrant)
    {
        this.weight = weight;
        this.dripping = dripping;
        this.barCode = barCode;
        this.company = company;
        this.warrant = warrant;
    }

    public double getWeight()
    {
        return weight;
    }

    public double getDripping()
    {
        return dripping;
    }

    public Calendar getWarrant()
    {
        return warrant;
    }

    public long getBarCode()
    {
        return barCode;
    }

    public long getCompany()
    {
        return company;
    }

    public boolean stillGood()
    {
        throw new NotImplementedException();
    }

    @Override
    public String toString()
    {
        return "Cheese{" +
                "weight=" + weight +
                ", dripping=" + dripping +
                ", barCode=" + barCode +
                ", company=" + company +
                ", warrant=" + warrant +
                '}';
    }
}


