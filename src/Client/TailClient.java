package Client;

import surajbab.unixTools.Tail;
import surajbab.unixTools.lib.File;

public class TailClient {
    public static void main(String[] args) {
        Tail tail = new Tail();
        int count = 10;
        String filename = args[0], fileContent;
        if (args[0].startsWith("-")) {
            count = Integer.parseInt(args[0].substring(1));
            filename = args[1];
        }
        fileContent = new File().readFile(filename);
        System.out.println(tail.TailContent(fileContent, count));
    }
}
