package lab4.aircrafts;

import java.util.Scanner;

public class Aircraft
{
    public Aircraft()
    {
        this.seatsNumber = SEATS_NUMBER_DEFAULT_VALUE;
        this.maxSpeed = MAX_SPEED_DEFAULT_VALUE;
        this.firm = FIRMA_DEFAULT_VALUE;
    }
    
    public Aircraft(
            int seatsNumber,
            float maxSpeed,
            String firm)
    {
        this.seatsNumber = seatsNumber;
        this.maxSpeed = maxSpeed;
        this.firm = firm;
    }
    
    public final static int SEATS_NUMBER_DEFAULT_VALUE = 0;
    public final static float MAX_SPEED_DEFAULT_VALUE = 0;
    public final static String FIRMA_DEFAULT_VALUE = "";
    
    private int seatsNumber;
    private float maxSpeed;
    private String firm;
    
    public int getSeatsNumber()
    {
        return this.seatsNumber;
    }
    
    public void setSeatsNumber(int seatsNumber)
    {
        this.seatsNumber = seatsNumber;
    }
    
    public float getMaxSpeed()
    {
        return this.maxSpeed;
    }
    
    public void setMaxSpeed(float maxSpeed)
    {
        this.maxSpeed = maxSpeed;
    }
    
    public String getFirm()
    {
        return this.firm;
    }
    
    public void setFirm(String firm)
    {
        this.firm = firm;
    }
    
    public void setAllInfo()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter firm: ");
        String inFirm = in.next();
        this.setFirm(inFirm);
        
        System.out.print("Enter seats number: ");
        int inSeatsNumber = in.nextInt();
        this.setSeatsNumber(inSeatsNumber);
        
        System.out.print("Enter max speed: ");
        float inMaxSpeed = in.nextFloat();
        this.setMaxSpeed(inMaxSpeed);

        System.out.println();
    }
    
    @Override
    public String toString()
    {
        return "TYPE: Aircraft;\n" +
               "FIRM: " + this.getFirm() + ";\n" +
               "SEATS NUMBER: " + this.getSeatsNumber() + ";\n" +
               "MAX SPEED: " + this.getMaxSpeed() + ".\n";
    }
}
