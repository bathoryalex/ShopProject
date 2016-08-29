package shop;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Calendar;

/**
 * Created by bathoryalex on 16/08/29.
 */
public abstract class Food
{
    protected long barCode;
    protected String company;
    protected Calendar warrant;

    public Food(long barCode, String company, Calendar warrant)
    {
        this.barCode = barCode;
        this.company = company;
        this.warrant = warrant;
    }

    public long getBarCode()
    {
        return barCode;
    }

    public String getCompany()
    {
        return company;
    }

    public Calendar getWarrant()
    {
        return warrant;
    }

    public boolean stillGood()
    {
        throw new NotImplementedException();
    }

    @Override
    public String toString()
    {
        return "Food{" +
                "barCode=" + barCode +
                ", company='" + company + '\'' +
                ", warrant=" + warrant +
                '}';
    }
}
