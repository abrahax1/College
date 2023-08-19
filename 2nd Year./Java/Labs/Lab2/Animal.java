// Program to set animals' attributes
public class Animal 
{
    private String name;
    private String breed;
    private Boolean domesticAnimalOrNot;

    //Only 1 attribute sent
	public Animal(String name)
    {
        this.name = name;

    }
    
    //All attributes sent
    public Animal(String name, String breed, Boolean domesticAnimalOrNot)
    {
        this.name = name;
        this.breed = breed;
        this.domesticAnimalOrNot = domesticAnimalOrNot;

    }

    //print 
    public String toString()
    {
        //error checking
        if (this.breed == null)
        {
            String ouput = "\nName: " + this.name;  
            return ouput;

        }
        else
        {
            String ouput = "\nName: " + this.name + ", Breed: " + this.breed + ", Domestic animal: " + this.domesticAnimalOrNot;
            return ouput;

        }  

    }

    public void setName(String name)
    {
        this.name = name;

    }

    public String getName()
    {
        return this.name;
    }

    public void makeNoise()
    {
        if (this.breed == "Dog")
        {
            System.out.println("Bark");
        }
        if (this.breed == "Cat")
        {
            System.out.println("Meow");
        }
        if (this.breed == "Bird")
        {
            System.out.println("Chirp");
        } 
    }
}
