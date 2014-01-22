package surajbab.unixTools;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static com.sun.javafx.fxml.expression.Expression.split;

public class Sort {
    public String sort(String content, char reverse) {
        String Data[];
        String sortedData = "";
        Data = content.split("\r\n");
        Arrays.sort(Data);
        for (int i =Data.length-1;i>=0;i--)
            sortedData = sortedData.concat(Data[i]).concat("\r\n");
        return sortedData;
    }

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
