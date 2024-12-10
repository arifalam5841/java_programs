import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.annotation.processing.FilerException;

public class rewritefile{

    public static int replacementcount(String filename, String targetedword,String replacementword){

        File file = new File(filename);
        File temptFile = new File("temptFile.txt");

        int count = 0;

        try(BufferedReader reader = new BufferedReader(new FileReader(file));
           BufferedWriter writer = new BufferedWriter(new FileWriter(temptFile))){
            String line;

            while ((line = reader.readLine()) != null) {
                
                int linecount = line.split(targetedword, -1).length -1;
                count += linecount;

                line = line.replace(targetedword, replacementword);
                writer.write(line);
                writer.newLine();
            }
        }

        catch(FileNotFoundException e){
            System.out.println("Error: File not found :" +e.getMessage() );
        }

        catch(IOException e){
            System.out.println("Error : Problem reading/writing the file -" + e.getMessage());
            return -1;
        }

        if(count >0){
            // if(!file.delete() || !temptFile.renameTo(file)){
            //     System.out.println("Error : Could not update the original file.");
            // }

            try{
                file.delete();
                temptFile.renameTo(file);
    
                System.out.println("sucess");
            }
            catch(Exception e){

                System.out.println("NO changes were made");
            }
            

  
        }

        else{
            temptFile.delete();

        }

return count;

    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("File content replacer");

        System.out.println("Enter the file name (with path if not in the same folder:");
        String filename = scanner.nextLine();

        System.out.println("Enter the word/phrase to be replaced");
        String targetword = scanner.nextLine();

        System.out.println("Enter the replacement word/phrase");
        String replacementword = scanner.nextLine();


        int replacementcount = replacementcount(filename, targetword, replacementword);

        if(replacementcount >0){
            System.out.println("Replacements completed. Total replacements made :" + replacementcount);

        }
        else{
            System.out.println("No replacements were made ");
        }
    }
}
