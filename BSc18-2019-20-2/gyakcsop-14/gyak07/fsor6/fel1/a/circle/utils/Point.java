

package circle.utils;


public class Point
{
    private double x;
    private double y;

    public double getX() { return x; }
    public double getY() { return y; }

    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }

    public Point()
    {
        x = y = 0;
    }

    public Point(Point that)
    {
        this.x = that.x;
        this.y = that.y;
    }

    public Point(double init_x, double init_y)
    {
        x = init_x;
        y = init_y;
    }

    public void move(double dx, double dy)
    {
        x += dx;
        y += dy;
    }

    public void mirror(double cx, double cy)
    {
        x = 2 * cx - x;
        y = 2 * cy - y;
    }

    public void mirror(Point that)
    {
        x = 2 * that.x - x;
        y = 2 * that.y - y;
    }

    public String toString()
    {
        return "(" + x + "," + y + ")";
    }
}

