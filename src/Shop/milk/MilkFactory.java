package shop.milk;

import shop.Milk;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Calendar;

/**
 * Created by bathoryalex on 16/08/29.
 */
public class MilkFactory
{
    public static Milk newLongLifeMilk(long barCode, int capacity, String company, Calendar warrant, double dripping, long price)
    {
        Milk longLifeMilk = MilkFactory.newLongLifeMilk(barCode, capacity, company, warrant, dripping, price);
        return longLifeMilk;
    }

    public static Milk newSemiLongLifeMilk(long barCode, int capacity, String company, Calendar warrant, double dripping, long price)
    {
        Milk semiLongLifeMilk = MilkFactory.newSemiLongLifeMilk(barCode, capacity, company, warrant, dripping, price);
        return  semiLongLifeMilk;
    }
}
