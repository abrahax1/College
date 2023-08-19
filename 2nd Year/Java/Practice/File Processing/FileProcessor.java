// Program to practice file processing (open, read, write a file)
import java.io.BufferedWriter;
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

    public FileProcessor(String fileName)
    {
        this.fileName = fileName; // better to use a setter
    }
    
    public void openFile()
    {
        fileExample = new File(fileName); // Opened the file
        System.out.println("File was opened");
    }

    public String readFile() 
    {
        String line = "Line not read";
        int lineCount = 1; 
        try 
        {
            Scanner scanner1 = new Scanner(fileExample);
            while(scanner1.hasNextLine()) //any next line in the file?
            {
                line = scanner1.nextLine();
                System.out.println("Line " + lineCount + ": " + line);
                lineCount++;
            }

            scanner1.close();
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("File Not found");
            e.printStackTrace();
        }

        return line;
    }

    // METHOD TO WRITE TO FILE (APPENDING TO FILE)
    public void writeToFile(String line)
    {
        try 
        {
            FileWriter fileToWrite = new FileWriter("Hello.txt", true);
            PrintWriter myWriter = new PrintWriter(fileToWrite);
            
            myWriter.println("\n" + line);
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
