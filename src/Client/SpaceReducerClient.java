package Client;

import surajbab.unixTools.lib.File;

public class SpaceReducerClient {
    public static void main(String[] args) {
        String fileData;
        fileData = new File().readFile(args[0]);
        System.out.println(fileData);
    }
}