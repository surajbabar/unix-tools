package surajbab.unixTools.head;

import surajbab.unixTools.lib.File;

public class Head {
    public static void main(String[] args) {
        int count =10;
        String filename = args[0],fileContent,result = "";

        File file = new File();

        if(args[0].startsWith("-")) {
            count = Integer.parseInt(args[0].substring(1));
            filename = args[1];
        }
        fileContent = file.readFile(filename);
        String lines[] =fileContent.split("\r\n");
        for (int line = 0; line < count-1; line++)
                result+=lines[line]+"\r\n";
        result+=lines[count-1];
        System.out.println(result);
    }
}