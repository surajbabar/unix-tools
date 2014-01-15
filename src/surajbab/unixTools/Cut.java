package surajbab.unixTools;

public class Cut {
    public String getFields(String data, int field, String delimitor) {
        String result = "", words[];
        String lines[] = data.split("\r\n");
        for (String line : lines) {
            words = line.split(delimitor);
            if (words.length >= field)
                result = result.concat(words[field - 1]);
            result = result.concat("\r\n");
        }
        return result;
    }
}