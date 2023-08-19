// Program to practice File management (read, open, write) and variable creation
public class Control {
    public static void main(String[] args) 
    {
        Date d1 = new Date(11, 03, 2021);
        System.out.println("Date: " + d1.toString());

        Job j1 = new Job(24000, 12345678, "Nurse");
        System.out.println(j1.toString());

        Employee e1 = new Employee("Abraham", "Izarra", "Male", new Date(15,01,2000), new Job(44000,1234,"Engineer"), 5678, 22, new Date(11,03,2021));
        System.out.println(e1.toString());
    }
}
