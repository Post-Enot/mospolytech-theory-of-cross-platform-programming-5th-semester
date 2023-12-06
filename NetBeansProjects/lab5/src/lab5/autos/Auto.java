package lab5.autos;

import java.util.Scanner;

/**
  * Базовый класс для экземпляров транспортных средств.
  * @author Вышегородских Виктор Егорович
  */
public class Auto
{
    /**
      * Стандартный коструктор без параметров. При создании объекта 
      * инициализирует поля стандартными значениями.
      */
    public Auto()
    {
        this.firm = Auto.FIRM_DEFAULT_VALUE;
        this.licensePlateNumber = Auto.LICENSE_PLATE_NUMBER_DEFAULT_VALUE;
        this.maxSpeed = Auto.MAX_SPEED_DEFAULT_VALUE;
    }

    /**
      * Конструктор для ручной инициализации значения свойств объекта.
      * @param firm название фирмы производителя.
      * @param licensePlateNumber государственный номер.
      * @param maxSpeed максимальная скорость (км/ч).
      */
    public Auto(
            String firm,
            String licensePlateNumber,
            int maxSpeed)
    {
        this.firm = firm;
        this.licensePlateNumber = licensePlateNumber;
        this.maxSpeed = maxSpeed;
    }
    
    /**
      * Константа-стандартное значение названия фирмы производителя.
      */
    public static final String FIRM_DEFAULT_VALUE = "NONAME";
    
    /**
      * Константа-стандартное значение государственного номера.
      */
    public static final String LICENSE_PLATE_NUMBER_DEFAULT_VALUE = "A000AA";

    /**
      * Константа-стандартное значение максимальной скорости (км/ч).
      */
    public static final int MAX_SPEED_DEFAULT_VALUE = 0;
    
    private String firm;
    private String licensePlateNumber;
    private int maxSpeed;

    /**
      * Getter-свойство названия фирмы производителя.
      * @return возвращает значение названия фирмы производителя.
      */
    public String getFirm()
    {
        return this.firm;
    }

    /**
      * Setter-свойство для инициализации значения названия фирмы производителя.
      * @param firm новое значение названия фирмы производителя.
      */
    public void setFirm(String firm)
    {
        this.firm = firm;
    }
    
    /**
      * Getter-свойство значения государственного номера.
      * @return возвращает значение государственного номера.
      */
    public String getLicensePlateNumber()
    {
        return this.licensePlateNumber;
    }
    
    /**
      * Setter-свойство для инициализации значения государственного номера.
      * @param licensePlateNumber новое значение государственного номера.
      */
    public void setLicensePlateNumber(String licensePlateNumber)
    {
        this.licensePlateNumber = licensePlateNumber;
    }
    
    /**
      * Getter-свойство макисмальной скорости (км/ч).
      * @return возвращает значение максимальной скорости (км/ч).
      */
    public int getMaxSpeed()
    {
        return this.maxSpeed;
    }

    /**
      * Setter-свойство максимальной скорости (км/ч).
      * @param maxSpeed новое значение максимальной скорости (км/ч).
      */
    public void setMaxSpeed(int maxSpeed)
    {
        this.maxSpeed = maxSpeed;
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
        
        System.out.print("Enter license plate number: ");
        String inLicensePlateNumber = in.next();
        this.setLicensePlateNumber(inLicensePlateNumber);
        
        System.out.print("Enter max speed: ");
        int inMaxSpeed = in.nextInt();
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
        return "TYPE: Auto;\n" +
               "FIRM: " + this.getFirm() + ";\n" +
               "LICENSE PLATE NUMBER: " + this.getLicensePlateNumber() + ";\n" +
               "MAX SPEED: " + this.getMaxSpeed() + ".\n";
    }
}
