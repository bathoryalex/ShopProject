package shop;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Hashtable;

/**
 * Created by bathoryalex on 8/16/2016.
 */
public class Grocery
{
    private String name;
    private String address;
    private String owner;
    private Hashtable<Long,Milk> milkBar;

    public Grocery(String name, String address, String owner, Hashtable<Long,Milk> milkBar)
    {
        this.name = name;
        this.address = address;
        this.owner = owner;
        this.milkBar = milkBar;
    }

    public Grocery(String name, String address, String owner)
    {
        this.name = name;
        this.address = address;
        this.owner = owner;
    }

    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }

    public String getOwner()
    {
        return owner;
    }

    public boolean isThereAnyMilk()
    {
        throw new NotImplementedException();
    }

    public Milk purchasedMilk(long barCode)
    {
        throw new NotImplementedException();
    }

    public void resupplyMilk(Milk m)
    {
        throw new NotImplementedException();
    }

}
