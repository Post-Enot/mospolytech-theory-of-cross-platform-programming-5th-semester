package lab5.aircrafts;

import java.util.Scanner;

/**
  * Класс для экземпляров самолёта.
  * @author Вышегородских Виктор Егорович
  */
public class Airplane extends Aircraft
{
    /**
      * Стандартный коструктор без параметров. При создании объекта 
      * инициализирует поля стандартными значениями.
      */
    public Airplane()
    {
        super();
        this.wingLength = WING_LENGTH_DEFAULT_VALUE;
    }
    
    /**
      * Конструктор для ручной инициализации значения свойств объекта.
      * @param seatsNumber количество сидячих мест.
      * @param maxSpeed максимальная скорость (км/ч).
      * @param firm фирма производителя.
      * @param wingLength длина крыльев.
      */
    public Airplane(
            int seatsNumber,
            float maxSpeed,
            String firm,
            float wingLength)
    {
        super(seatsNumber, maxSpeed, firm);
        this.wingLength = wingLength;
    }
    
    /**
      * Константа-стандартное значение длины крыльев.
      */
    public static final float WING_LENGTH_DEFAULT_VALUE = 0;
    
    private float wingLength;
    
    /**
      * Getter-свойство для получения длины крыльев.
      * @return возвращает длину крыльев.
      */
    public float getWingLength()
    {
        return this.wingLength;
    }
    
    /**
      * Setter-свойство для инициализации значения длины крыльев.
      * @param wingLength длина крыльев.
      */
    public void setWingLength(float wingLength)
    {
        this.wingLength = wingLength;
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
        float inWingLength = in.nextFloat();
        this.setWingLength(inWingLength);
        
        System.out.println();
    }
    
    /**
      * Создаёт строковое представление экземпляра объекта.
      * @return возвращает строковое представление экземпляра объекта.
      */
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
