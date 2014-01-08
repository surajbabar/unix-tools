package surajbab.unixTools.lib;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.String;

public class File {
    public String readFile(String filename){
        String file= " ";
        try{
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            while(null != (line = br.readLine()))
                file = file +line+"\r\n";
        }
        catch(Exception f){
            System.err.println(f);
        }
        return file;
    }
}
