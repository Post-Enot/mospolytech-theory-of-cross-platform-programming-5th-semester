package Utils;

public class Color {
    public Color() { }
    
    public Color(int r, int g, int b)
    {
        this.r = r;
        this.g = g;
        this.b = b;
    }
        
    public int r;
    public int g;
    public int b;
    
    public static Color red()
    {
        return new Color(255, 0, 0);
    }
    
    public static Color green()
    {
        return new Color(0, 255, 0);
    }
    
    public static Color blue()
    {
        return new Color(0, 0, 255);
    }
    
    public static Color black()
    {
        return new Color(0, 0, 0);
    }
    
    public static Color white()
    {
        return new Color(255, 255, 255);
    }
    
    @Override
    public String toString()
    {
        return "rgb(" + this.r + ", " + this.g + ", " + this.b + ")";
    }
}
