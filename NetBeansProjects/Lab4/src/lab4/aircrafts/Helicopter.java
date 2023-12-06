package lab4.aircrafts;

import java.util.Scanner;

public class Helicopter extends Aircraft
{
    public Helicopter()
    {
        super();
        this.screwsNumber = SCREWS_NUMBER_DEFAULT_VALUE;
    }
    
    public Helicopter(
            int seatsNumber,
            float maxSpeed,
            String firm,
            int screwsNumber)
    {
        super(seatsNumber, maxSpeed, firm);
        this.screwsNumber = screwsNumber;
    }
    
    public static final int SCREWS_NUMBER_DEFAULT_VALUE = 0;
    
    private int screwsNumber;
    
    public int getScrewsNumber()
    {
        return this.screwsNumber;
    }
    
    public void setScrewsNumber(int screwsNumber)
    {
        this.screwsNumber = screwsNumber;
    }
    
    @Override
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

        System.out.print("Enter wing length: ");
        int inScrewsNumber = in.nextInt();
        this.setScrewsNumber(inScrewsNumber);
        
        System.out.println();
    }
    
    @Override
    public String toString()
    {
        return "TYPE: Helicopter;\n" +
               "FIRM: " + this.getFirm() + ";\n" +
               "SEATS NUMBER: " + this.getSeatsNumber() + ";\n" +
               "MAX SPEED: " + this.getMaxSpeed() + ";\n" +
                "SCREWS NUMBER: " + this.getScrewsNumber() + ".\n";
    }
}
