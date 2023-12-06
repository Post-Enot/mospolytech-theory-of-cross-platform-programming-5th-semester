package lab6.Figures;

import Utils.Color;

public class Triangle extends Figure implements IHasAngles
{
    public Triangle()
    {
        super();
    }
    
    public Triangle(Color color)
    {
        super.setColor(color);
    }
    
    public Triangle(float sideA, float sideB, float sideC) throws Exception
    {
        super();
        Triangle.throwIfCanNotExist(sideA, sideB, sideC);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    
    public Triangle(
            float sideA,
            float sideB,
            float sideC,
            Color color) throws Exception
    {
        super.setColor(color);
        Triangle.throwIfCanNotExist(sideA, sideB, sideC);       
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    
    public static final float DEFAULT_SIDE_SIZE = 1.0f;
    
    public static final float DEFAULT_SIDE_A = Triangle.DEFAULT_SIDE_SIZE;
    public static final float DEFAULT_SIDE_B = Triangle.DEFAULT_SIDE_SIZE;
    public static final float DEFAULT_SIDE_C = Triangle.DEFAULT_SIDE_SIZE;
    
    public static final int ANGLES_NUMBER = 3;
    
    private float sideA = Triangle.DEFAULT_SIDE_A;
    private float sideB = Triangle.DEFAULT_SIDE_B;
    private float sideC = Triangle.DEFAULT_SIDE_C;
    
    public float getSideA()
    {
        return this.sideA;
    }
    
    public void setSideA(float value) throws Exception
    {
        Triangle.throwIfCanNotExist(
                value,
                this.sideB,
                this.sideC);
        this.sideA = value;
    }
    
    public float getSideB()
    {
        return this.sideB;
    }
    
    public void setSideB(float value) throws Exception
    {
        Triangle.throwIfCanNotExist(
                this.sideA,
                value,
                this.sideC);
        this.sideB = value;
    }
    
    public float getSideC()
    {
        return this.sideC;
    }
    
    public void setSideC(float value) throws Exception
    {
        Triangle.throwIfCanNotExist(
                this.sideA,
                this.sideB,
                value);
        this.sideC = value;
    }
    
    @Override
    public float calculateArea()
    {
        return Triangle.calculateArea(
                this.sideA,
                this.sideB,
                this.sideC);
    }

    @Override
    public float calculatePerimeter()
    {
        return Triangle.calculateArea(
                this.sideA,
                this.sideB,
                this.sideC);
    }
    
    @Override
    public int getAnglesNumber()
    {
        return Triangle.ANGLES_NUMBER;
    }
    
    @Override
    public String toString()
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("type: Triangle\n");
        stringBuilder.append("Color: " + this.getColor() + "\n");
        stringBuilder.append("Area: " + this.calculateArea() + "\n");
        stringBuilder.append("Perimeter: " + this.calculatePerimeter() + "\n");
        stringBuilder.append("Has angles: true\n");
        stringBuilder.append("Angles number: " + this.getAnglesNumber() + "\n");
        stringBuilder.append("Side A: " + this.sideA + "\n");
        stringBuilder.append("Side B: " + this.sideB + "\n");
        stringBuilder.append("Side C: " + this.sideC + "\n");
        return stringBuilder.toString();
    }
    
    public float calculateHalfMeter()
    {
        return Triangle.calculateHalfMeter(
                this.sideA,
                this.sideB,
                this.sideC);
    }
    
    public static float calculateHalfMeter(
            float sideA,
            float sideB,
            float sideC)
    {
        return Triangle.calculatePerimeter(sideA, sideB, sideC) / 2;
    }
    
    public static float calculatePerimeter(
            float sideA,
            float sideB,
            float sideC)
    {
        return sideA + sideB + sideC;
    }
    
    public static float calculateArea(float sideA, float sideB, float sideC)
    {
        float halfMeter = Triangle.calculateHalfMeter(sideA, sideB, sideC);
        return (float)Math.sqrt(
                    halfMeter * (halfMeter - sideA) *
                    (halfMeter - sideB) *
                    (halfMeter - sideC));
    }
    
    public static boolean canTriangleExist(
            float sideA,
            float sideB,
            float sideC)
    {
        return ((sideA + sideB) > sideC) ||
               ((sideA + sideC) > sideB) ||
               ((sideB + sideC) > sideA);
    }
    
    private static void throwIfCanNotExist(
        float sideA,
        float sideB,
        float sideC) throws Exception
    {
        if (!Triangle.canTriangleExist(sideA, sideB, sideC))
        {
            throw new Exception();
        }
    }
}
