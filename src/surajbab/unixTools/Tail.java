package surajbab.unixTools;

public class Tail {
    public String TailContent(String fileContent, int count) {
        String lines[] = fileContent.split("\r\n");
        String tailLines = "";
        int noOfLines = lines.length - count;
        if (noOfLines < 0) noOfLines = 0;
        for (int i = noOfLines; i < lines.length; i++)
            tailLines += lines[i] + "\n";
        return tailLines;
    }
}
