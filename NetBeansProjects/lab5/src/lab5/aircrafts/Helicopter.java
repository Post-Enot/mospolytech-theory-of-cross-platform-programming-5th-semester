package lab5.aircrafts;

import java.util.Scanner;

/**
  * Класс для экземпляров вертолёта.
  * @author Вышегородских Виктор Егорович
  */
public class Helicopter extends Aircraft
{
    /**
      * Стандартный коструктор без параметров. При создании объекта 
      * инициализирует поля стандартными значениями.
      */
    public Helicopter()
    {
        super();
        this.screwsNumber = SCREWS_NUMBER_DEFAULT_VALUE;
    }
  
    /**
      * Конструктор для ручной инициализации значения свойств объекта.
      * @param seatsNumber количество сидячих мест.
      * @param maxSpeed максимальная скорость (км/ч).
      * @param firm фирма производителя.
      * @param screwsNumber количество винтов.
      */
    public Helicopter(
            int seatsNumber,
            float maxSpeed,
            String firm,
            int screwsNumber)
    {
        super(seatsNumber, maxSpeed, firm);
        this.screwsNumber = screwsNumber;
    }
    
    /**
      * Константа-значение количества винтов.
      */
    public static final int SCREWS_NUMBER_DEFAULT_VALUE = 0;
    
    private int screwsNumber;
    
    /**
      * Getter-свойство количества винтов.
      * @return возвращает количество винтов.
      */
    public int getScrewsNumber()
    {
        return this.screwsNumber;
    }
    
    /**
      * Setter-свойство для инициализации значения количества винтов.
      * @param screwsNumber новое значение количества винтов.
      */
    public void setScrewsNumber(int screwsNumber)
    {
        this.screwsNumber = screwsNumber;
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
    
    /**
      * Создаёт строковое представление экземпляра объекта.
      * @return возвращает строковое представление экземпляра объекта.
      */
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
