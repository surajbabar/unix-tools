package surajbab.unixTools;

public class Uniq {
    public String UniqLines(String fileData) {
        String lines[] = fileData.split("\n");
        String uniqData = lines[0] + "\r\n";
        for (int line = 1; line < lines.length; line++) {
            if (lines[line - 1].equals(lines[line]))
                continue;
            uniqData += lines[line] + "\r\n";
        }
        return uniqData;
    }
}