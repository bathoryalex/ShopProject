package shop.milk;

import shop.Milk;

import java.util.Calendar;

/**
 * Created by bathoryalex on 16/08/29.
 */
public class LongLifeMilk extends Milk
{
    public LongLifeMilk(long barCode, int capacity, String company, Calendar warrant, double dripping)
    {
        super(barCode,
                capacity,
                company,
                warrant,
                dripping);
    }
}
