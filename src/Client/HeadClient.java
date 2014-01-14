package Client;

import surajbab.unixTools.Head;
import surajbab.unixTools.lib.File;

public class HeadClient {
    public static void main(String[] args) {
        Head head = new Head();
        int count = 10;
        String filename = args[0], fileContent;

        File file = new File();

        if (args[0].startsWith("-")) {
            count = Integer.parseInt(args[0].substring(1));
            filename = args[1];
        }
        fileContent = file.readFile(filename);
        System.out.println(head.headContent(fileContent, count));
    }
}
