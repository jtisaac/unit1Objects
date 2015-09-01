import java.util.Random;

public class DieSimulator
{
    public static void main(String[] args)
    {
        Random rundum = new Random();
        int num = rundum.nextInt(6) + 1;
        System.out.println(num);
    }
}
