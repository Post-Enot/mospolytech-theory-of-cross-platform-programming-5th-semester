package lab4.autos;

import java.util.Scanner;

public class Auto
{
    public Auto()
    {
        this.firm = Auto.FIRM_DEFAULT_VALUE;
        this.licensePlateNumber = Auto.LICENSE_PLATE_NUMBER_DEFAULT_VALUE;
        this.maxSpeed = Auto.MAX_SPEED_DEFAULT_VALUE;
    }

    public Auto(
            String firm,
            String licensePlateNumber,
            int maxSpeed)
    {
        this.firm = firm;
        this.licensePlateNumber = licensePlateNumber;
        this.maxSpeed = maxSpeed;
    }
    
    public static final String FIRM_DEFAULT_VALUE = "NONAME";
    public static final String LICENSE_PLATE_NUMBER_DEFAULT_VALUE = "A000AA";
    public static final int MAX_SPEED_DEFAULT_VALUE = 0;
    
    private String firm;
    private String licensePlateNumber;
    private int maxSpeed;

    public String getFirm()
    {
        return this.firm;
    }

    public void setFirm(String firm)
    {
        this.firm = firm;
    }
    
    public String getLicensePlateNumber()
    {
        return this.licensePlateNumber;
    }
    
    public void setLicensePlateNumber(String licensePlateNumber)
    {
        this.licensePlateNumber = licensePlateNumber;
    }
    
    public int getMaxSpeed()
    {
        return this.maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed)
    {
        this.maxSpeed = maxSpeed;
    }
    
    public void setAllInfo()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter firm: ");
        String inFirm = in.next();
        this.setFirm(inFirm);
        
        System.out.print("Enter license plate number: ");
        String inLicensePlateNumber = in.next();
        this.setLicensePlateNumber(inLicensePlateNumber);
        
        System.out.print("Enter max speed: ");
        int inMaxSpeed = in.nextInt();
        this.setMaxSpeed(inMaxSpeed);

        System.out.println();
    }
    
    @Override
    public String toString()
    {
        return "TYPE: Auto;\n" +
               "FIRM: " + this.getFirm() + ";\n" +
               "LICENSE PLATE NUMBER: " + this.getLicensePlateNumber() + ";\n" +
               "MAX SPEED: " + this.getMaxSpeed() + ".\n";
    }
}
