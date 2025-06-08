package clas;

public class Square<T extends  Number>
{
    private T side;
    public Square(T initialSide)
    {
        side = initialSide;
    } // end constructor
    public T getSide()
    {
        return side;
    } // end getSide
    public double getArea() {
        double s = side.doubleValue();
        return s*s;
    }
} // end Square