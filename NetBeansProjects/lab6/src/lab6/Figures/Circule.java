package lab6.Figures;

import Utils.Color;

public class Circule extends Figure
{
    public Circule()
    {
        super();
    }
    
    public Circule(Color color)
    {
        super.setColor(color);
    }
    
    public Circule(float radius)
    {
        super();
        this.radius = radius;
    }
    
    public Circule(float radius, Color color)
    {
        super.setColor(color);
        this.radius = radius;
    }
    
    public static final float DEFAULT_RADIUS = 1.0f;
    
    private float radius = Circule.DEFAULT_RADIUS;
    
    public float getRadius()
    {
        return this.radius;
    }
    
    public void setRadius(float value)
    {
        this.radius = value;
    }
    
    public float getDiameter()
    {
        return this.radius / 2;
    }
    
    @Override
    public float calculateArea()
    {
        return Circule.calculateArea(this.radius);
    }

    @Override
    public float calculatePerimeter()
    {
        return Circule.calculatePerimeter(this.radius);
    }
    
    @Override
    public String toString()
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("type: Circule\n");
        stringBuilder.append("Color: " + this.getColor() + "\n");
        stringBuilder.append("Area: " + this.calculateArea() + "\n");
        stringBuilder.append("Perimeter: " + this.calculatePerimeter() + "\n");
        stringBuilder.append("Has angles: false\n");
        stringBuilder.append("Radius: " + this.radius + "\n");
        return stringBuilder.toString();
    }
    
    public static float calculateArea(float radius)
    {
        return (float)Math.PI * radius * radius;
    }
    
    public static float calculatePerimeter(float radius)
    {
        return 2 * (float)Math.PI * radius;
    }
}
