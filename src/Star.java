
public class Star {
    private double x ;
    private double y ;
    private final double z ;

    private final double speed ;
    private double size = 3;
    static final double CENTER_POINT = 350;

    public Star(double x, double y, double z,double speed) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.speed = speed;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }


    public double getSize() {
        return size;
    }


    void move()
    {
        if ( x >= CENTER_POINT)
        {
            x += speed;

        } else if (x< CENTER_POINT)
        {
            x -= speed;


        }

        if ( y < CENTER_POINT) {
            y -= speed;
        } else if (y > CENTER_POINT) {
            y += speed;
        }

    }


}
