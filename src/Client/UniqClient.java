package Client;

import surajbab.unixTools.Uniq;
import surajbab.unixTools.lib.File;

public class UniqClient {
    public static void main(String[] args) {
        Uniq uniq = new Uniq();
        String filename = args[0], fileData;
        fileData = new File().readFile(filename);
        System.out.println(uniq.UniqLines(fileData));
    }
}
