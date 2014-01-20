package Client;

import surajbab.unixTools.SpaceReducer;
import surajbab.unixTools.lib.File;

public class SpaceReducerClient {
    public static void main(String[] args) {
        SpaceReducer sp = new SpaceReducer();
        String fileData;
        fileData = new File().readFile(args[0]);
        System.out.println(sp.reduceSpaces(fileData));
    }
}