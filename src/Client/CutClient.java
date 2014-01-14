package Client;

import surajbab.unixTools.Cut;
import surajbab.unixTools.lib.File;

public class CutClient {
    public static void main(String[] args) {
        Cut cutter = new Cut();
        int fieldValue = Integer.parseInt(args[1]);
        String delimitor = args[2];
        String fileData = new File().readFile(args[0]);
        String columnData = cutter.getFields(fileData, fieldValue, delimitor);
        System.out.println(columnData);
    }
}
