package lab5.aircrafts;

import java.util.Scanner;

/**
  * Базовый класс для летательных средств.
  * @author Вышегородских Виктор Егорович
  */
public class Aircraft
{
    /**
      * Стандартный конструктор без параметров. При создании объекта 
      * инициализирует поля стандартными значениями.
      */
    public Aircraft()
    {
        this.seatsNumber = SEATS_NUMBER_DEFAULT_VALUE;
        this.maxSpeed = MAX_SPEED_DEFAULT_VALUE;
        this.firm = FIRMA_DEFAULT_VALUE;
    }
    
    /**
      * Конструктор для ручной инициализации значения свойств объекта.
      * @param seatsNumber количество сидячих мест.
      * @param maxSpeed максимальная скорость (км/ч).
      * @param firm фирма производителя.
      */
    public Aircraft(
            int seatsNumber,
            float maxSpeed,
            String firm)
    {
        this.seatsNumber = seatsNumber;
        this.maxSpeed = maxSpeed;
        this.firm = firm;
    }
    
    /**
      * Константа-стандартное значение количества сидячих мест.
      */
    public final static int SEATS_NUMBER_DEFAULT_VALUE = 0;

    /**
      * Константа-стандартное значение максимальной скорости (км/ч).
      */
    public final static float MAX_SPEED_DEFAULT_VALUE = 0;

    /**
      * Константа-стандартное значение фирмы производителя.
      */
    public final static String FIRMA_DEFAULT_VALUE = "";
    
    private int seatsNumber;
    private float maxSpeed;
    private String firm;
    
    /**
      * Getter-свойства количества сидячих мест.
      * @return Возвращает количество сидячих мест.
      */
    public int getSeatsNumber()
    {
        return this.seatsNumber;
    }
    
    /**
      * Setter-свойства количества сидячих мест.
      * @param seatsNumber количество сидячих мест.
      */
    public void setSeatsNumber(int seatsNumber)
    {
        this.seatsNumber = seatsNumber;
    }
    
    /**
      * Getter-свойства максимальной скорости (км/ч).
      * @return Возвращает максимальную скорость (км/ч).
      */
    public float getMaxSpeed()
    {
        return this.maxSpeed;
    }
    
    /**
      * Setter-свойства максимальной скорости (км/ч).
      * @param maxSpeed максимальная скорость (км/ч).
      */
    public void setMaxSpeed(float maxSpeed)
    {
        this.maxSpeed = maxSpeed;
    }
    
    /**
      * Getter-свойства названия фирмы.
      * @return возвращает название фирмы.
      */
    public String getFirm()
    {
        return this.firm;
    }
    
    /**
      * Setter-свойство названия фирмы.
      * @param firm название фирмы.
      */
    public void setFirm(String firm)
    {
        this.firm = firm;
    }
    
    /**
      * Инициализирует все значения свойств экземпляра объекта значениями,
      * считываемыми через консоль.
      */
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
    
    /**
      * Создаёт строковое представление экземпляра объекта.
      * @return возвращает строковое представление экземпляра объекта.
      */
    @Override
    public String toString()
    {
        return "TYPE: Aircraft;\n" +
               "FIRM: " + this.getFirm() + ";\n" +
               "SEATS NUMBER: " + this.getSeatsNumber() + ";\n" +
               "MAX SPEED: " + this.getMaxSpeed() + ".\n";
    }
}
