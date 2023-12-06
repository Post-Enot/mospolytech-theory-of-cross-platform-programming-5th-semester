package lab6.Figures;

import Utils.Color;

public class Rectangle extends Figure implements IHasAngles
{
    public Rectangle()
    {
        super();
    }
    
    public Rectangle(Color color)
    {
        super.setColor(color);
    }
    
    public Rectangle(float side)
    {
        super();
        this.sideA = side;
        this.sideB = side;
    }
    
    public Rectangle(float side, Color color)
    {
        super.setColor(color);
        this.sideA = side;
        this.sideB = side;
    }
    
    public Rectangle(float sideA, float sideB)
    {
        super();
        this.sideA = sideA;
        this.sideB = sideB;
    }
    
    public Rectangle(float sideA, float sideB, Color color)
    {
        super.setColor(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }
    
    public static final float DEFAULT_SIDE_SIZE = 1.0f;
    
    public static final float DEFAULT_SIDE_A =
            Rectangle.DEFAULT_SIDE_SIZE;
    public static final float DEFAULT_SIDE_B =
            Rectangle.DEFAULT_SIDE_SIZE;
    
    public static final int ANGLES_NUMBER = 4;

    private float sideA = Rectangle.DEFAULT_SIDE_A;
    private float sideB = Rectangle.DEFAULT_SIDE_B;
    
    public float getSideA()
    {
        return this.sideA;
    }
    
    public void setSideA(float value)
    {
        this.sideA = value;
    }
    
    public float getSideB()
    {
        return this.sideB;
    }
    
    public void setSideB(float value)
    {
        this.sideB = value;
    }
    
    public float getWidth()
    {
        if (this.sideA > this.sideB)
        {
            return this.sideB;
        }
        return this.sideA;
    }
    
    public float getLength()
    {
        if (this.sideB > this.sideA)
        {
            return this.sideA;
        }
        return this.sideB;
    }
    
    public boolean isSquare()
    {
        return this.sideA == this.sideB;
    }
    
    @Override
    public float calculateArea()
    {
        return Rectangle.calculateArea(
                this.sideA,
                this.sideB);
    }

    @Override
    public float calculatePerimeter()
    {
        return Rectangle.calculatePerimeter(
                this.sideA,
                this.sideB);
    }
    
    @Override
    public int getAnglesNumber()
    {
        return Rectangle.ANGLES_NUMBER;
    }
    
    @Override
    public String toString()
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("type: Rectangle\n");
        stringBuilder.append("Color: " + this.getColor() + "\n");
        stringBuilder.append("Area: " + this.calculateArea() + "\n");
        stringBuilder.append("Perimeter: " + this.calculatePerimeter() + "\n");
        stringBuilder.append("Has angles: true\n");
        stringBuilder.append("Angles number: " + this.getAnglesNumber() + "\n");
        stringBuilder.append("Is square: " + this.isSquare() + "\n");
        stringBuilder.append("Width: " + this.getWidth() + "\n");
        stringBuilder.append("Length: " + this.getLength() + "\n");
        return stringBuilder.toString();
    }
    
    public static boolean isSquare(float sideA, float sideB)
    {
        return sideA == sideB;
    }
    
    public static float calculateArea(float sideA, float sideB)
    {
        return sideA * sideB;
    }
    
    public static float calculatePerimeter(float sideA, float sideB)
    {
        return (sideA + sideB) * 2;
    }
}
