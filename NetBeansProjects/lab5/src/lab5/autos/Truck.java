package lab5.autos;

import java.util.Scanner;

/**
  * Класс для экземпляров грузовиков.
  * @author Вышегородских Виктор Егорович
  */
public class Truck extends Auto
{
    /**
      * Стандартный коструктор без параметров. При создании объекта 
      * инициализирует поля стандартными значениями.
      */
    public Truck()
    {
        super(); 
        this.model = MODEL_DEFAULT_VALUE;
        this.power = POWER_DEFAULT_VALUE;
        this.isTrailer = IS_TRAILER_DEFAULT_VALUE;
    }
    
    /**
      * Конструктор для ручной инициализации значения свойств объекта.
      * @param firm название фирмы-производителя.
      * @param licensePlateNumber государственный номер.
      * @param maxSpeed максимальная скорость (км/ч).
      * @param model название модели.
      * @param power мощность грузовика.
      * @param isTrailer имеет ли прицеп.
      */
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

    /**
      * Константа-стандартное значение названия модели.
      */
    public static final String MODEL_DEFAULT_VALUE = "NONAME";
    
    /**
      * Константа-стандартное значение мощности.
      */
    public static final int POWER_DEFAULT_VALUE = 0;
    
    /**
      * Константа-стандартное значение наличия прицепа.
      */
    public static final boolean IS_TRAILER_DEFAULT_VALUE = false;
    
    private String model;
    private int power;
    private boolean isTrailer;
    
    /**
      * Getter-свойство названия модели.
      * @return название модели.
      */
    public String getModel()
    {
        return this.model;
    }

    /**
      * Setter-свойство для инициализации значения названия модели.
      * @param model название модели.
      */
    public void setModel(String model)
    {
        this.model = model;
    }
    
    /**
      * Getter-свойство мощности.
      * @return возвращает значение мощности.
      */
    public int getPower()
    {
        return this.power;
    }
    
    /**
      * Setter-свойство для инициализации значения мощности.
      * @param power значение мощности.
      */
    public void setPower(int power)
    {
        this.power = power;
    }
    
    /**
      * Getter-свойство наличия прицепа.
      * @return true, если имеется прицеп; иначе false.
      */
    public Boolean isTrailer()
    {
        return this.isTrailer;
    }

    /**
      * Setter-свойство наличия прицепа.
      * @param isTrailer значение наличия прицепа.
      */
    public void setIsTrailer(boolean isTrailer)
    {
        this.isTrailer = isTrailer;
    }
    
    /**
      * Инициализирует все значения свойств экземпляра объекта значениями,
      * считываемыми через консоль.
      */
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

    /**
      * Создаёт строковое представление экземпляра объекта.
      * @return возвращает строковое представление экземпляра объекта.
      */
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
