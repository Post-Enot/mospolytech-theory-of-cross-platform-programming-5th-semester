package lab5.aircrafts;

import java.util.ArrayList;

/**
  * Класс-контейнер для летательных средств.
  * @author Вышегородских Виктор Егорович
  */
public class Airline
{
    /**
      * Стандартный коструктор без параметров. При создании объекта 
      * инициализирует поля стандартными значениями.
      */
    public Airline() { }

    /**
      * Конструктор для ручной инициализации значения свойств объекта.
      * @param aircrafts 
      */
    public Airline(ArrayList<Aircraft> aircrafts)
    {
        this.aircrafts = aircrafts;
    }

    /**
      * Константа-стандартное значение пустого значения.
      */
    public static final String AIRLINE_IS_EMPTY_STRING_VALUE =
            "AIRLINE IS EMPTY.";
    
    private ArrayList<Aircraft> aircrafts = new ArrayList<>();
    
    /**
      * Подсчитывает количество объектов типа Airplane  и возвращает значение.
      * Метод O(n).
      * @return количество объектов типа Airplane.
      */
    public int countAirplanes()
    {
        int count = 0;
        for (Aircraft aircraft: this.aircrafts)
        {
            if (aircraft instanceof Airplane)
            {
                count += 1;
            }
        }
        return count;
    }
    
    /**
      * Подсчитывает количество объектов типа Helicopter и возвращает значение.
      * Метод O(n).
      * @return количество объектов типа Helicopter.
      */
    public int countHelicopters()
    {
        int count = 0;
        for (Aircraft aircraft: this.aircrafts)
        {
            if (aircraft instanceof Helicopter)
            {
                count += 1;
            }
        }
        return count;
    }
    
    /**
      * Добавляет летательное средство в общий пул объектов.
      * @param aircraft летательное средство.
      */
    public void addAircraft(Aircraft aircraft)
    {
        this.aircrafts.add(aircraft);
    }
    
    /**
      * Удаляет летательное средство из общего пула объектов.
      * @param aircraft летательное средство.
      */
    public void removeAircraft(Aircraft aircraft)
    {
        this.aircrafts.remove(aircraft);
    }
    
    /**
      * Проверяет, содержится ли переданное летательное средство в общем пуле
      * объектов.
      * @param aircraft летательное средство.
      * @return true, если летательное средство содержится в общем пуле; иначе
      * false.
      */
    public boolean containsAircraft(Aircraft aircraft)
    {
        return this.aircrafts.contains(aircraft);
    }
    
    /**
      * Создаёт строковое представление экземпляра объекта.
      * @return возвращает строковое представление экземпляра объекта.
      */
    @Override
    public String toString()
    {
        if (this.aircrafts.isEmpty())
        {
            return AIRLINE_IS_EMPTY_STRING_VALUE;
        }

        StringBuilder stringBuilder = new StringBuilder("AIRLINE:\n");
        for (Aircraft aircraft: this.aircrafts)
        {
            stringBuilder.append(aircraft);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
