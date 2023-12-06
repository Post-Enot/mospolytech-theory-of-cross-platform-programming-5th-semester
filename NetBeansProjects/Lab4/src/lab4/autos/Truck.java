package lab4.autos;

import java.util.Scanner;

public class Truck extends Auto
{
    public Truck()
    {
        super(); 
        this.model = MODEL_DEFAULT_VALUE;
        this.power = POWER_DEFAULT_VALUE;
        this.isTrailer = IS_TRAILER_DEFAULT_VALUE;
    }
    
    public Truck(
            String firm,
            String licensePlateNumber,
            int maxSpeed,
            String model,
            int power,
            boolean isTrailer)
    {
        super(firm, licensePlateNumber, maxSpeed);
        this.model = model; 
        this.power = power;
        this.isTrailer = isTrailer;
    }

    public static final String MODEL_DEFAULT_VALUE = "NONAME";
    public static final int POWER_DEFAULT_VALUE = 0;
    public static final boolean IS_TRAILER_DEFAULT_VALUE = false;
    
    private String model;
    private int power;
    private boolean isTrailer;
    
    public String getModel()
    {
        return this.model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }
    
    public void setPower(int power)
    {
        this.power = power;
    }
    
    public int getPower()
    {
        return this.power;
    }

    public void setIsTrailer(boolean isTrailer)
    {
        this.isTrailer = isTrailer;
    }

    public Boolean isTrailer()
    {
        return this.isTrailer;
    }
    
    @Override
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

        System.out.print("Enter model: ");
        String inModel = in.next();
        this.setModel(inModel);

        System.out.print("Enter power: ");
        int inPower = in.nextInt();
        this.setPower(inPower);

        System.out.print("Enter is trailer (true/false): ");
        boolean inIsTrailer = in.nextBoolean();
        this.setIsTrailer(inIsTrailer);

        System.out.println();
    }

    @Override
    public String toString()
    {
        return "TYPE: Truck;\n" +
               "FIRM: " + this.getFirm() + ";\n" +
               "LICENSE PLATE NUMBER: " + this.getLicensePlateNumber() + ";\n" +
               "MAX SPEED: " + this.getMaxSpeed() + ";\n" +
               "MODEL: " + this.getModel() + ";\n" +
               "POWER: " + this.getPower() + ";\n" +
               "IS TRAILER: " + this.isTrailer() + ".\n";
    }
}
