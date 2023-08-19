// Program to send animals' attributes and print them
public class Control 
{
    public static void main(String[] args)
    {
        Animal A1 = new Animal("Spot", "Dog", true);
        System.out.println(A1);
        A1.makeNoise();

        Animal A2 = new Animal("Leo", "Cat", true);
        System.out.println(A2);
        A2.makeNoise();

        Animal A3 = new Animal("feathers", "Bird", true);
        System.out.println(A3); 
        A3.makeNoise();

        //Not visible because attributes are private
        // A1.name = "\nLemon";
        // System.out.println(A1.name); 
        // System.out.println(A3.name); 

        A1.setName("Sam");
        A1.getName();
        System.out.println(A1);
        
        
    }
}
