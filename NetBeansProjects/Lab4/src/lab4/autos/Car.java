package lab4.autos;

import java.util.Scanner;

public class Car extends Auto
{
    public Car()
    {
        super();
        this.model = MODEL_DEFAULT_VALUE;
        this.doorsNumber = DOORS_NUMBER_DEFAULT_VALUE;
        this.isFullTime = IS_FULL_TIME_DEFAULT_VALUE;
    }

    public Car(
            String firm,
            String licensePlateNumber,
            int maxSpeed,
            String model,
            int doorsNumber,
            boolean isFullTime)
    {
        super(firm, licensePlateNumber, maxSpeed);
        this.model = model;
        this.doorsNumber = doorsNumber;
        this.isFullTime = isFullTime;
    }

    public static final String MODEL_DEFAULT_VALUE = "NONAME";
    public static final int DOORS_NUMBER_DEFAULT_VALUE = 4;
    public static final boolean IS_FULL_TIME_DEFAULT_VALUE = false;
    
    private String model;
    private int doorsNumber;
    private boolean isFullTime;
    
    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public int getDoorsNumber()
    {
        return doorsNumber;
    }
    
    public void setDoorsNumber(int doorsNumber)
    {
        this.doorsNumber = doorsNumber;
    }

    public boolean isFullTime()
    {
        return this.isFullTime;
    }

    public void setIsFullTime(boolean isFullTime)
    {
        this.isFullTime = isFullTime;
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
        
        System.out.print("Enter doors number: ");
        int inDoorsNumber = in.nextInt();
        this.setDoorsNumber(inDoorsNumber);
        
        System.out.print("Enter is full time (true/false): ");
        boolean inIsFullTime = in.nextBoolean();
        this.setIsFullTime(inIsFullTime);
        
        System.out.println();
    }
    
    @Override
    public String toString()
    {
        return "TYPE: Car;\n" +
               "FIRM: " + this.getFirm() + ";\n" +
               "LICENSE PLATE NUMBER: " + this.getLicensePlateNumber() + ";\n" +
               "MAX SPEED: " + this.getMaxSpeed() + ";\n" +
               "MODEL: " + this.getModel() + ";\n" +
               "DOORS NUMBER: " + this.getDoorsNumber() + ";\n" +
               "IS FULL TIME: " + this.isFullTime() + ".\n";
    }
}
