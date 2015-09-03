import java.awt.Color;
public class TurtleLabCh2
{
    public static void main(String[] args)
      throws InterruptedException
    {
       World turtleWorld = new World();
       //C:\Users\jtisaac\Desktop\GitHub\mediaComputation\bookClasses\doc\Turtle.html
       Turtle turtle1 = new Turtle(turtleWorld);
       Turtle turtle2 = new Turtle(turtleWorld);
       Turtle turtle3 = new Turtle(turtleWorld);
       turtle1.turn(45);
       turtle2.setShellColor(Color.BLACK);
       int x = 1;
       int y = 1;
       while (x < 210)
       {
           turtle1.turn(45);
           turtle1.forward(x);
           Thread.sleep(50); // sleep 1000 milliseconds (1 second)
           x+= 1;
       }
       while (y <2000)
       {
           turtle2.turn(40);
           turtle2.forward(1);
           turtle2.turn(350);
           turtle2.forward(10);
           Thread.sleep(10);
           // sleep 1000 milliseconds (1 second)
           y += 1;
           turtle3.turn(320);
           turtle3.forward(1);
           turtle3.turn(100);
           turtle3.forward(10);
           Thread.sleep(10); // sleep 1000 milliseconds (1 second)
           y += 1;
       }
       
    }
}