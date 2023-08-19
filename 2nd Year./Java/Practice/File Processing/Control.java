public class Control {
    public static void main(String[] args) 
    {
        // OPEN FILE
        FileProcessor file1 = new FileProcessor("Hello.txt");
        file1.openFile(); 

        // WRITING TO FILE (APPENDING)
        String firstLine = "1st time writing to a file";
        file1.writeToFile(firstLine);

         // READING FILE
         file1.readFile();
    }
}
