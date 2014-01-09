package surajbab.unixTools.tail;

import surajbab.unixTools.lib.File;

public class Tail {
    public static void main(String[] args) {
        int count=10;
        String line,tailLines = "",filename = args[0],fileContent = "";
        if(args[0].startsWith("-")) {
            count = Integer.parseInt(args[0].substring(1));
            filename = args[1];
        }
        fileContent = File.readFile(filename);
        String lines[] = fileContent.split("\r\n");
        int noOfLines = lines.length - count;
        for (int i = noOfLines; i < lines.length; i++) {
            tailLines += lines[i]+"\n";
        }
        System.out.println(tailLines);
       ;
    }

}
