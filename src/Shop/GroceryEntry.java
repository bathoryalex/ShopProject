package shop;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by bathoryalex on 8/16/2016.
 */
public class GroceryEntry
{
    private Milk m;
    private int quantity;
    private int price;

    public GroceryEntry(Milk m, int quantity, int price)
    {
        this.m = m;
        this.quantity = quantity;
        this.price = price;
    }

    public Milk getM()
    {
        return m;
    }

    public void setM(Milk m)
    {
        this.m = m;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public void addQuantity(int quantity)
    {
        throw new NotImplementedException();
    }

    public void substractQuantity(int quantity)
    {
        throw new NotImplementedException();
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }
}
