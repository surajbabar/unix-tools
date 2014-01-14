package surajbab.unixTools;

import java.util.Arrays;

public class Sort {
    public String sort(String content) {
        String Data[];
        String sortedData = "";
        Data = content.split("\r\n");
        Arrays.sort(Data);
        for (String row : Data)
            sortedData = sortedData.concat(row).concat("\r\n");
        return sortedData;
    }
}
