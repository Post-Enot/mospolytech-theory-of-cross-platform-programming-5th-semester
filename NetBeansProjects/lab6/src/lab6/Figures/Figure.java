package lab6.Figures;

import Utils.Color;
import java.util.Scanner;

public abstract class Figure
{
    public Figure()
    {
        this.color = Figure.getDefaultFigureColor();
    }
    
    public abstract float calculateArea();
    
    public abstract float calculatePerimeter();
    
    public void setColor(Color value)
    {
        this.color = value;
    }
    
    public Color getColor()
    {
        return this.color;
    }
    
    private Color color;
    
    public void mathOperationWithArea() throws Exception
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter math operator (+, -, /, *): ");        
        String operator = this.InputOperator(in);

        System.out.print("Enter number: ");
        float right = in.nextFloat();

        float left = this.calculateArea();
        float result = this.CalculateMathOperation(left, right, operator);
        
        System.out.println(
                "area " + operator + " " + right + " = " + result);
    }
    
    public void mathOperationWithPerimeter() throws Exception
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter math operator (+, -, /, *): ");        
        String operator = this.InputOperator(in);

        System.out.print("Enter number: ");
        float right = in.nextFloat();

        float left = this.calculatePerimeter();
        float result = this.CalculateMathOperation(left, right, operator);
        
        System.out.println(
                "area " + operator + " " + right + " = " + result);
    }
    
    @Override
    public String toString()
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("type: Figure\n");
        stringBuilder.append("Color: " + this.color + "\n");
        stringBuilder.append("Area: " + this.calculateArea() + "\n");
        stringBuilder.append("Perimeter: " + this.calculatePerimeter() + "\n");
        if (this instanceof IHasAngles hasAngles)
        {
            stringBuilder.append("Has angles: true\n");
            stringBuilder.append("Angles number: " + 
                    hasAngles.getAnglesNumber() + "\n");
        }
        else
        {
            stringBuilder.append("Has angles: false\n");
        }
        return stringBuilder.toString();
    }
    
    private float CalculateMathOperation(
            float left,
            float right,
            String operator) throws Exception
    {
        switch (operator)
        {
            case "+" -> {
                return left + right;
            }
            
            case "-" -> {
                return left - right;
            }
            
            case "/" -> {
                return left / right;
            }
            
            case "*" -> {
                return left * right;
            }
            
            default -> throw new Exception();
        }
    }
    
    private String InputOperator(Scanner in)
    {
        String inOperator;
        while (true)
        {
            inOperator = in.next();

            if ("+".equals(inOperator) ||
                "-".equals(inOperator) ||
                "/".equals(inOperator) ||
                "*".equals(inOperator))
            {
                break;
            }
            System.out.println(
                    "Invalid operator: Enter one of the valid operators "
                            + "(+, -, /, *)");
        }
        return inOperator;
    }
    
    public static Color getDefaultFigureColor()
    {
        return Color.white();
    }
}
