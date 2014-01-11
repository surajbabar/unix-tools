package Client;

import surajbab.unixTools.lib.File;
import surajbab.unixTools.sort.Sort;

import java.io.IOException;

public class SortClient {
    public static void main(String[] args) throws IOException {
        Sort sort =new Sort();
        sort.sort(args[0]);
        String file= new File().readFile(args[0]);
        System.out.println(file);
    }
}
