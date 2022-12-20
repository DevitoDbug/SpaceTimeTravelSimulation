import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Handler {

   ArrayList <Star> starList ;
    Random random = new Random();
    private double x = random.nextDouble(-100 , 900) ;
    private double y= random.nextDouble(-100 , 900) ;
    private double z = random.nextDouble(-100 , 900) ;

    private final double speed = random.nextDouble(0 , 2) ;

    Handler()
    {
        starList = new ArrayList<>();
    }
    void addStar()
    {
        starList.add(new Star(x , y , z , speed));
        x = random.nextDouble(0 , 900) ;
        y = random.nextDouble(0 , 900) ;
        z = random.nextDouble(0 , 900) ;

    }

    void updatePosition()
    {
        for (Star star : starList)
        {
            star.move();
            star.setSize(star.getSize()+ 0.06);
        }
    }

    void draw(Graphics g)
    {
        g.setColor(Color.CYAN);
        for (int i = 0 ; i < starList.size() ; i++) {
            g.fillOval((int)starList.get(i).getX(), (int)starList.get(i).getY()
                    , (int)starList.get(i).getSize() , (int)starList.get(i).getSize());


            //removing the starts that are off the screen
            if ( (starList.get(i).getX() > 750 || starList.get(i).getX() < 0)||
                    ( starList.get(i).getY() > 750 || starList.get(i).getY() < 0))
            {
                starList.remove(i);
                starList.add(new Star(x , y , z , speed));
                x = random.nextDouble(0 , 700) ;
                y = random.nextDouble(0, 700) ;
                z = random.nextDouble(0 , 700) ;

            }
        }



    }

}
