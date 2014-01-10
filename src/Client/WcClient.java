package Client;
import surajbab.unixTools.lib.File;
import surajbab.unixTools.wc.WC;

public class WcClient{
public static void main(String[] args) {
        String fileName = args[0];
        String fileData = new File().readFile(fileName);
        WC wc = new WC(fileData);
        System.out.println(wc.lineCount()+ "\t" +wc.wordCount()+ "\t" +wc.charCount());
        }
}