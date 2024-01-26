package Java;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class a46_java_FileHandling {
    public static void main(String[] args) {
        //creating file

        File myfile = new File("firstfilee.txt");
        try {
            myfile.createNewFile();
        } catch (IOException e) {
            System.out.println("Cant create file");
            throw new RuntimeException(e);
        }


        //Code to write to file
        try {
            FileWriter fileWriter = new FileWriter("firstfilee.txt");
            fileWriter.write("This is the second file of java");
            fileWriter.close();
        }
        catch (Exception e){
            System.out.println(e);
        }

        //Code to read from file
        File mfile = new File("firstfilee.txt");
        try {
            Scanner sc = new Scanner(mfile);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        //code to delet file
        File yfile = new File("dhruv.txt");
        if (yfile.delete()){
            System.out.println("File has been deleted :"+yfile.getName());
        }
        else{
            System.out.println("problem in deleting file");
        }

    }
}
