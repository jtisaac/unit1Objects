public class TurtleLabCh2
{
    public static void main(String[] args)
    {
       World turtleWorld = new World();
       Turtle turtle1 = new Turtle(turtleWorld);
       Turtle turtle2 = new Turtle(turtleWorld);
       turtle1.turn(45);
       int x = 1;
       int y = 1;
       while (x < 210)
       {
           turtle1.turn(45);
           turtle1.forward(x);
           x+= 1;
        }
       while (y <12)
       {
           turtle2.turn(5);
           turtle2.forward(10);
           turtle2.turn(350);
           turtle2.forward(10);
           y += 1;
        }
     }
 }
