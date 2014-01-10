package surajbab.unixTools.uniq;

import surajbab.unixTools.lib.File;

public class Uniq {
    public static void main(String[] args) {
        String uniqData,filename = args[0],fileData;
        fileData = new File().readFile(filename);
        String lines[] = fileData.split("\n");
        uniqData = lines[0]+"\r\n";
        for (int line = 1; line < lines.length; line++) {
            if(lines[line-1].equals(lines[line]))
                continue;
            uniqData += lines[line]+"\r\n";
        }
        System.out.println(uniqData);
    }
}