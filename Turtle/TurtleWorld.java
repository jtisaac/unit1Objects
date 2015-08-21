import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
       World turtleWorld = new World();
       Turtle turtle = new Turtle(turtleWorld);
       turtle.turn(45);
       int x = 1;
       while (x < 1000)
       {turtle.turn(45);
           turtle.forward(x);
           x+= 1;
           
        
    }
       Turtle turtle1 = new Turtle(turtleWorld);
}
}