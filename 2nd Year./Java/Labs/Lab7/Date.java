// Class to Create a Date variable
public class Date 
{
    private int day;
    private int month;
    private int year;
    private String Date;

    // CONSTRUCTOR
    public Date(int day, int month, int year)
    {   
        this.day = day;
        this.month = month;
        this.year = year;

        // ERROR CHECKING
        if (this.day > 0 && this.day < 31 && this.month > 0 && this.month < 13) 
        {
            this.Date = this.day + "/" + this.month + "/" + this.year;
    
        }
        else
        {
            this.Date = "Invalid Date";
        }
    }

    // PRINT
    public String toString() 
    {
        return this.Date;
    }

    // GETTERS & SETTERS
    public int getDay() 
    {
        return day;
    }
    public void setDay(int day) 
    {
        this.day = day;
    }
    public int getMonth() 
    {
        return month;
    }
    public void setMonth(int month) 
    {
        this.month = month;
    }
    public int getYear() 
    {
        return year;
    }
    public void setYear(int year) 
    {
        this.year = year;
    }

}
