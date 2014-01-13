package surajbab.unixTools.sort;


import java.io.*;
import java.util.Arrays;

public class Sort {
    public void sort(String filename) throws IOException {
        File file = new File(filename);
         String filedata = new surajbab.unixTools.lib.File().readFile(filename);
        String Data[];
        String sortedData ="";
        Data = filedata.split("\r\n");
        Arrays.sort(Data);
        for (String row : Data)
            sortedData =sortedData.concat(row).concat("\r\n");
        FileWriter fw =new FileWriter(file.getAbsoluteFile());
        BufferedWriter br = new BufferedWriter(fw);
        fw.write(sortedData);
        fw.close();
    }
}
