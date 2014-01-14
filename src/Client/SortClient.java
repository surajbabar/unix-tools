package Client;

import surajbab.unixTools.Sort;
import surajbab.unixTools.lib.File;

import java.io.IOException;

public class SortClient {
    public static void main(String[] args) throws IOException {
        Sort sort = new Sort();
        String file = new File().readFile(args[0]);
        System.out.println(sort.sort(file));
    }
}
