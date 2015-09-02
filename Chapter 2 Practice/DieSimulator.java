import java.util.Random;

public class DieSimulator
{
    public static void main(String[] args)
    {
        //option A Saahilr12@gmail.com
        Random rundum = new Random();
        int num = rundum.nextInt(6) + 1; 
        //num+= 1;
        System.out.println(num);
        //option B
       double dieValue2 = Math.random(); //returns [0,1}
       dieValue2 *= 6; //returns [0,6)
       dieValue2 += 1; //returns [1,7)
       System.out.println((int) dieValue2);
    }
}

