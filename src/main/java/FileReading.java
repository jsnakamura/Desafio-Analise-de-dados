import java.io.*;
import java.util.ArrayList;

/**
 * Class for file reading
 *
 * @Version 1.0 11/09/2019
 *
 * @Author Juliano Nakamura
 */
public class FileReading {

    /** ArrayList with each line read from the file */
    private ArrayList<String> dataLines = new ArrayList<>();

    /** Path to the folder with entry data */
    String pathname = "..\\Desafio-Analise-de-dados\\Data\\In";


    /**
     * Method to store the file content in an ArrayList
     * @return dataLines is the Arraylist with the content
     */
    public ArrayList<String> getData() {

        File directory = new File(pathname);

        try {

            for (File file : directory.listFiles()) {

                BufferedReader buffRead = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));

                String lines;

                buffRead.read();

                while((lines = buffRead.readLine()) != null)
                {
                    dataLines.add(lines);
                }

                buffRead.close();
            }

        }catch(IOException e)
        {
            System.err.printf("Failed opening file", e.getMessage());
        }
        return dataLines;
    }
}
