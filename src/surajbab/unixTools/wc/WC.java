package surajbab.unixTools.wc;

public class WC {
    private String text;

    public WC(String Text) {
        text = Text;
    }

    public int lineCount() {
        return text.split("\r\n").length;
    }

    public int charCount() {
        return text.length();
    }

    public int wordCount() {
        return text.split("\\W+").length;
    }
}
