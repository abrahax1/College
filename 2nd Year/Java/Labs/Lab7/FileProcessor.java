// Class to Manage file (read, open, write)
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileProcessor 
{
    private String fileName;
    private File fileExample;

    // GET NAME FROM CONTROL CLASS
    public FileProcessor(String fileName)
    {
        this.fileName = fileName; // better to use a setter
    }
    
    // OPEN FILE
    public void openFile()
    {
        fileExample = new File(fileName); // Opened the file
    }

    // READ FILE, WITH WORD COMPARISON
    public boolean readFile(String role) 
    {
        boolean check = false;
        try 
        {
            // SCAN(READ) FILE 
            Scanner scanner1 = new Scanner(fileExample);
            
            // CHECKS FILE FOR NEXT LINE
            while(scanner1.hasNextLine()) 
            {
                // STORE WORD FROM FILE AND REDUCE LENGTH BY 1 (REMOVE ",")
                String word = scanner1.next();
                word = word.substring(0, (word.length() - 1));

                // WORD COMPARISON
                if (role.equals(word))
                {
                    check = true;
                    scanner1.close();
                    return check; 
                }
                else
                {
                    check = false;
                }
                
            }

            scanner1.close();
            return check;

        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("File Not found");
            e.printStackTrace();
        }

        return true;
    }

    // METHOD TO WRITE TO FILE (APPENDING TO FILE)
    public void writeToFile(String firstName, String surName)
    {
        try 
        {
            FileWriter fileToWrite = new FileWriter("EmployeeName.txt", true);
            PrintWriter myWriter = new PrintWriter(fileToWrite);
            
            myWriter.println(firstName + " " + surName + "\n");
            myWriter.close();

        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("File Not found"); 
            e.printStackTrace();

        } 
        catch (IOException e) 
        {
            System.out.println("IO Error");  
            e.printStackTrace();
        }
    }
}
