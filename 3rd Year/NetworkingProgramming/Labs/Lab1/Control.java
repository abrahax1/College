public class Control 
{
    public static void main(String[] args)
    {
        int a = 2, b = 3;

        // Q1
        System.out.println("Q1.- Hello, World! \n");

        // Q2
        System.out.println("Q2.- " + (2 + 2) + "\n");

        // Q3 + Q4 
        if (a == b)
        {
            System.out.println("Q3.- " + (a + b));
        }
        else if(a > b)
        {
            System.out.println("Q3.- " + (a * b));
        }
        else
        {
            System.out.println("Q3.- " + (a - b));
        }
    }
}
