// Class to Create a Job variable 
public class Job 
{
    private int salary;
    private int jobID;
    private String role;
    private String Job;

    // CONSTRUCTOR
    public Job(int salary, int jobID, String role)
    {
        this.salary = salary;
        this.jobID = jobID;
        this.role = role;

        // OPEN FILE
        FileProcessor f1 = new FileProcessor("roles.txt");
        f1.openFile();

        // READ FILE
        boolean check = f1.readFile(this.role);

        // ERROR CHECKING
        if (check == true)
        {
            this.Job = "Salary: €" + this.salary + ", Job ID: " + this.jobID + ", Role: " + this.role;
        }
        else
        {
            this.Job = "Job not available";
        }

    }

     // PRINT
     public String toString() 
     {
         return this.Job;
     }

    // GETTERS & SETTERS
    public int getSalary() 
    {
        return salary;
    }
    public void setSalary(int salary) 
    {
        this.salary = salary;
    }
    public int getJobID() 
    {
        return jobID;
    }
    public void setJobID(int jobID) 
    {
        this.jobID = jobID;
    }
    public String getRole() 
    {
        return role;
    }
    public void setRole(String role) 
    {
        this.role = role;
    }
    
}
