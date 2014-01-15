package Client;

import surajbab.unixTools.lib.File;

public class SpaceReducer {
    public static void main(String[] args) {
        String fileData;
        fileData = new File().readFile(args[0]);
        fileData = fileData.replaceAll("[ ]+", " ");
        System.out.println(fileData);
    }
}