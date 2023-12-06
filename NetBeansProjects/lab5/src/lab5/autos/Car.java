package lab5.autos;

import java.util.Scanner;

/**
  * Класс для экземпляров легковых машин.
  * @author Вышегородских Виктор Егорович
  */
public class Car extends Auto
{
    /**
      * Стандартный коструктор без параметров. При создании объекта 
      * инициализирует поля стандартными значениями.
      */
    public Car()
    {
        super();
        this.model = MODEL_DEFAULT_VALUE;
        this.doorsNumber = DOORS_NUMBER_DEFAULT_VALUE;
        this.isFullTime = IS_FULL_TIME_DEFAULT_VALUE;
    }

    /**
      * Конструктор для ручной инициализации значения свойств объекта.
      * @param firm название фирмы-производителя.
      * @param licensePlateNumber государственный номер машины.
      * @param maxSpeed максимальная скорость (км/ч).
      * @param model название модели машины.
      * @param doorsNumber количество дверей.
      * @param isFullTime является ли машина полноприводной.
      */
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

    /**
      * Константа-стандартное значение название модели.
      */
    public static final String MODEL_DEFAULT_VALUE = "NONAME";
    
    /**
      * Константа-стандартное значение количества дверей.
      */
    public static final int DOORS_NUMBER_DEFAULT_VALUE = 4;
    
    /**
      * Константа-стандартное значение является ли машина полноприводной.
      */
    public static final boolean IS_FULL_TIME_DEFAULT_VALUE = false;
    
    private String model;
    private int doorsNumber;
    private boolean isFullTime;
    
    /**
      * Getter-свойство значения названия модели.
      * @return возвращает название модели.
      */
    public String getModel()
    {
        return model;
    }

    /**
      * Setter-свойство для инициализации значения названия модели.
      * @param model новое название модели.
      */
    public void setModel(String model)
    {
        this.model = model;
    }

    /**
      * Getter-свойство количества дверей.
      * @return возвращает количество дверей.
      */
    public int getDoorsNumber()
    {
        return doorsNumber;
    }
    
    /**
      * Setter-свойство для инициализации значения количества дверей.
      * @param doorsNumber количество дверей.
      */
    public void setDoorsNumber(int doorsNumber)
    {
        this.doorsNumber = doorsNumber;
    }

    /**
      * Getter-свойство является ли машина полноприводной.
      * @return возвращает true, если машина полноприводная; иначе falseю
      */
    public boolean isFullTime()
    {
        return this.isFullTime;
    }

    /**
      * Setter-свойство для инициализации значения является ли машина
      * полноприводной.
      * @param isFullTime новое значение является ли машина полноприводной.
      */
    public void setIsFullTime(boolean isFullTime)
    {
        this.isFullTime = isFullTime;
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
        
        System.out.print("Enter doors number: ");
        int inDoorsNumber = in.nextInt();
        this.setDoorsNumber(inDoorsNumber);
        
        System.out.print("Enter is full time (true/false): ");
        boolean inIsFullTime = in.nextBoolean();
        this.setIsFullTime(inIsFullTime);
        
        System.out.println();
    }
    
    /**
      * Создаёт строковое представление экземпляра объекта.
      * @return возвращает строковое представление экземпляра объекта.
      */
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
