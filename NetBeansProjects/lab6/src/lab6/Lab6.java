package lab6;

import Utils.Color;
import lab6.Figures.*;

public class Lab6
{
    public static final String STRING_DIVIDER = "\n=== === === === ===\n";
    
    public static void main(String[] args) throws Exception
    {
        Figure figure;
        Circule circule = new Circule(
            3,
            Color.red());
        Triangle triangle = new Triangle(
            1,
            1,
            1,
            Color.green());
        Rectangle rectangle = new Rectangle(
            2,
            2,
            Color.blue());

        System.out.println(STRING_DIVIDER);
        
        System.out.println("Circule area: " + circule.calculateArea());
        System.out.println("Triangle perimeter: " +
                triangle.calculatePerimeter());
        System.out.println("Is rectangle a square: " + rectangle.isSquare());

        System.out.println(STRING_DIVIDER);
        
        figure = circule;
        figure.mathOperationWithArea();
        figure.mathOperationWithPerimeter();

        System.out.println(STRING_DIVIDER);
        
        figure = new Triangle();
        System.out.println(figure);

        System.out.println(STRING_DIVIDER);

        figure.mathOperationWithArea();
        figure.mathOperationWithPerimeter();
        
        System.out.println(STRING_DIVIDER);

        figure = new Rectangle();
        System.out.println(figure);

        System.out.println(STRING_DIVIDER);

        figure.mathOperationWithArea();
        figure.mathOperationWithPerimeter();
    }
}
