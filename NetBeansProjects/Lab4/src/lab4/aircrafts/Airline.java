package lab4.aircrafts;

import java.util.ArrayList;

public class Airline
{
    public Airline() { }

    public Airline(ArrayList<Aircraft> aircrafts)
    {
        this.aircrafts = aircrafts;
    }

    public static final String AIRLINE_IS_EMPTY_STRING_VALUE =
            "AIRLINE IS EMPTY.";
    
    private ArrayList<Aircraft> aircrafts = new ArrayList<>();
    
    public int countAirplanes()
    {
        int count = 0;
        for (Aircraft aircraft: this.aircrafts)
        {
            if (aircraft instanceof Airplane)
            {
                count += 1;
            }
        }
        return count;
    }
    
    public int countHelicopters()
    {
        int count = 0;
        for (Aircraft aircraft: this.aircrafts)
        {
            if (aircraft instanceof Helicopter)
            {
                count += 1;
            }
        }
        return count;
    }
    
    public void addAircraft(Aircraft aircraft)
    {
        this.aircrafts.add(aircraft);
    }
    
    public void removeAircraft(Aircraft aircraft)
    {
        this.aircrafts.remove(aircraft);
    }
    
    public boolean containsAircraft(Aircraft aircraft)
    {
        return this.aircrafts.contains(aircraft);
    }
        
    @Override
    public String toString()
    {
        if (this.aircrafts.isEmpty())
        {
            return AIRLINE_IS_EMPTY_STRING_VALUE;
        }

        StringBuilder stringBuilder = new StringBuilder("AIRLINE:\n");
        for (Aircraft aircraft: this.aircrafts)
        {
            stringBuilder.append(aircraft);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
