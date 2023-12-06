package lab4.aircrafts;

import java.util.Scanner;

public class Airplane extends Aircraft
{
    public Airplane()
    {
        super();
        this.wingLength = WING_LENGTH_DEFAULT_VALUE;
    }
    
    public Airplane(
            int seatsNumber,
            float maxSpeed,
            String firm,
            float wingLength)
    {
        super(seatsNumber, maxSpeed, firm);
        this.wingLength = wingLength;
    }
    
    public static final float WING_LENGTH_DEFAULT_VALUE = 0;
    
    private float wingLength;
    
    public float getWingLength()
    {
        return this.wingLength;
    }
    
    public void setWingLength(float wingLength)
    {
        this.wingLength = wingLength;
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
        float inWingLength = in.nextFloat();
        this.setWingLength(inWingLength);
        
        System.out.println();
    }
    
    @Override
    public String toString()
    {
        return "TYPE: Airplane;\n" +
               "FIRM: " + this.getFirm() + ";\n" +
               "SEATS NUMBER: " + this.getSeatsNumber() + ";\n" +
               "MAX SPEED: " + this.getMaxSpeed() + ";\n" +
               "WING LENGTH: " + this.getWingLength() + ".\n";
    }
}
