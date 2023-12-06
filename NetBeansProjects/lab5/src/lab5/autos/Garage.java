package lab5.autos;

import java.util.ArrayList;

/**
  * Класс-контейнер для автомобилей.
  * @author Вышегородских Виктор Егорович
  */
public class Garage
{
    /**
      * Стандартный коструктор без параметров. При создании объекта 
      * инициализирует поля стандартными значениями.
      */
    public Garage() { }

    /**
      * Конструктор для ручной инициализации значения свойств объекта.
      * @param autos список автомобилей.
      */
    public Garage(ArrayList<Auto> autos)
    {
        this.autos = autos;
    }

    /**
      * Константа-стандартное значение строкового представления пустого гаража.
      */
    public static final String GARAGE_IS_EMPTY_STRING_VALUE =
            "GARAGE IS EMPTY.";
    
    private ArrayList<Auto> autos = new ArrayList<>();
    
    /**
      * Добавляет автомобиль в общий пулл.
      * @param auto автомобиль.
      */
    public void addAuto(Auto auto)
    {
        this.autos.add(auto);
    }
    
    /**
      * Удаляет автомобиль из общего пулла.
      * @param auto автомобиль.
      */
    public void removeAuto(Auto auto)
    {
        this.autos.remove(auto);
    }
    
    /**
      * Проверяет наличие автомобиля в общем пулле объектов.
      * @param auto автомобиль.
      * @return true, если общий пуль содержит автомобиль; иначе false.
      */
    public boolean containsAuto(Auto auto)
    {
        return this.autos.contains(auto);
    }

    /**
      * Создаёт строковое представление экземпляра объекта.
      * @return возвращает строковое представление экземпляра объекта.
      */
    @Override
    public String toString()
    {
        if (this.autos.isEmpty())
        {
            return GARAGE_IS_EMPTY_STRING_VALUE;
        }

        StringBuilder stringBuilder = new StringBuilder("GARAGE:\n");
        for (Auto auto: this.autos)
        {
            stringBuilder.append(auto);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
