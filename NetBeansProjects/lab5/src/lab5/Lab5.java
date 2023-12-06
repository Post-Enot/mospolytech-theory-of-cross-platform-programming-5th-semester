package lab5;

import lab5.aircrafts.*;
import lab5.autos.*;

/**
  * Класс-оболочка, содержащий в себе метод-точку входа в приложение, а также
  * методы для тестирования функционала реализованных классов.
  * @author Вышегородских Виктор Егорович
  */
public class Lab5
{
    /**
      * Метод-точка входа в приложение.
      * @param args массив аргументов. В нашем случае не играет прикладной
      * роли.
      */
    public static void main(String[] args)
    {
        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
    }
    
    /**
      * Первый метод для тестирования функционала класса Auto: проверяется
      * работа конструктора с параметрами для ручной инициализации значений
      * свойств объекта.
      */
    public static void test1()
    {
        Auto auto = new Auto(
                "Ford",
                "P431EE",
                180);
        System.out.println(auto);
    }

    /**
      * Второй метод для тестирования функционала класса Auto: проверяется
      * работа метода setAllInfo() для инициализации значений свойств объекта
      * через консоль.
      */
    public static void test2()
    {
        Auto auto = new Auto();
        auto.setAllInfo();
        System.out.println(auto);
    }
    
    /**
      * Третий метод тестирования функционала классов Auto и Car: проверяется
      * работа стандартных конструкторов, а также работы методов setAllInfo()
      * для инициализации значений свойств объектов через консоль.
      */
    public static void test3()
    {
        Auto auto = new Auto();
        auto.setAllInfo();
        System.out.println(auto);
        
        Car car0 = new Car(
                "Ford",
                "B222HH",
                200,
                "Mustang",
                2,
                false);

        Car car1 = new Car();
        car1.setAllInfo();
        
        System.out.println("First car:");
        System.out.println(car0);

        System.out.println("Second car:");
        System.out.println(car1);

        Truck truck = new Truck();
        truck.setAllInfo();
        System.out.println(truck);
    }
    
    /**
      * Четвёртый метод тестирования функционала Garage, Car и Truck: 
      * проверяется работа конструкторов для инициализации значений свойств
      * объектов, а также функционал класса Garage, а именно добавление и
      * проверка наличия машин в гараже.
      */
    public static void test4()
    {
        Garage garage = new Garage();
        Car car0 = new Car(
                "Ford",
                "O888OO",
                200,
                "Mustang",
                2,
                false);

        garage.addAuto(car0);

        Car car1 = new Car(
                "LADA",
                "T100AA",
                140,
                "Kalina",
                4,
                false);
        garage.addAuto(car1);
        
        Truck truck = new Truck(
                "Dove",
                "K451TT",
                160,
                "DTS",
                700,
                true);

        garage.addAuto(truck);
        System.out.println(garage);

        System.out.print("Does garage contains \"Ford\": ");
        if (garage.containsAuto(car0))
        {
            System.out.println("true.");
        }
        else
        {
            System.out.println("false.");
        }
    }
    
    /**
      * Пятый метод тестирования функционала классов Auto, Car, Garage и Truck:
      * проверяется работа конструкторов для инициализации значений свойств 
      * объектов, а также функционал класса Garage, а именно добавление
      * экземпляров Auto в коллекцию и её дальнейший вывод.
      */
    public static void test5()
    {
        Auto autoDefault = new Auto();
        Auto autoCustom = new Auto(
            "Cherokee",
            "H211HH",
            250);

        Car carDefault = new Car();
        Car carCustom = new Car(
            "Mercedes",
            "H451HH",
            300,
            "Benz",
            4,
            true);

        Truck truckDefault = new Truck();
        Truck truckCustom = new Truck(
            "Track",
            "H999HH",
            120,
            "ttt",
            20,
            true);
        
        Garage garage = new Garage();

        garage.addAuto(autoDefault);
        garage.addAuto(autoCustom);
        garage.addAuto(carDefault);
        garage.addAuto(carCustom);
        garage.addAuto(truckDefault);
        garage.addAuto(truckCustom);

        System.out.println(garage);
    }
    
    /**
      * Шестой метод тестирования функционала классов Aircraft, Airplane,
      * Helicopter и Airline: проверяется работа конструкторов для
      * инициализации значений свойств объектов, а также функционал класса
      * Airline, а именно добавление и последующий вывод элементов в консоль.
      */
    public static void test6()
    {
        Aircraft aircraftDefault = new Aircraft();
        Aircraft aircraftCustom = new Aircraft(
            0,
            10.5f,
            "ZALA Lancet");
        
        Airplane airplaneDefault = new Airplane();
        Airplane airplaneCustom = new Airplane(
            80,
            20.0f,
            "Boeing",
            10.0f);
        
        Helicopter helicopterDefault = new Helicopter();
        Helicopter helicopterCustom = new Helicopter(
            4,
            15.0f,
            "Harbin Aircraft Industry Group",
            4);
        
        Airline airline = new Airline();

        airline.addAircraft(aircraftDefault);
        airline.addAircraft(aircraftCustom);
        airline.addAircraft(airplaneDefault);
        airline.addAircraft(airplaneCustom);
        airline.addAircraft(helicopterDefault);
        airline.addAircraft(helicopterCustom);
        
        System.out.println(airline);
    }
}
