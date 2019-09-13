import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class for file reading
 *
 * @Version 1.0 11/09/2019
 *
 * @Author Juliano Nakamura
 */
public class FileReading {

    Print printer = new Print();

    File directory;
    String path = "E:\\Projects\\Desafio-Analise-de-dados\\Data\\In";

    ArrayList<String> dataLines = new ArrayList<>();



    public ArrayList<String> getData() {

        directory = new File(path);

        for(File file : directory.listFiles())
        {
            try {
                Scanner newFile = new Scanner(file);

                while(newFile.hasNext())
                {
                    dataLines.add(newFile.nextLine());
                }

                newFile.close();
            }catch(IOException e)
            {
                System.err.printf("Failed opening file", e.getMessage());
            }
        }
        return dataLines;
    }
}
