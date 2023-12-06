package lab4.autos;

import java.util.ArrayList;

public class Garage
{
    public Garage() { }

    public Garage(ArrayList<Auto> autos)
    {
        this.autos = autos;
    }

    public static final String GARAGE_IS_EMPTY_STRING_VALUE =
            "GARAGE IS EMPTY.";
    
    private ArrayList<Auto> autos = new ArrayList<>();
    
    public void addAuto(Auto auto)
    {
        this.autos.add(auto);
    }
    
    public void removeAuto(Auto auto)
    {
        this.autos.remove(auto);
    }
    
    public boolean containsAuto(Auto auto)
    {
        return this.autos.contains(auto);
    }

    @Override
    public String toString()
    {
        if (this.autos.isEmpty())
        {
            return GARAGE_IS_EMPTY_STRING_VALUE;
        }

        StringBuilder stringBuilder = new StringBuilder("GARAGE:\n");
        for (Auto auto: this.autos)
        {
            stringBuilder.append(auto);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
