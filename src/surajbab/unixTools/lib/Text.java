package surajbab.unixTools.lib;
import java.lang.String;
public class Text {
    public int lines(String text){
        String  lines[] =text.split("\r\n");
        return lines.length;
    }
    public int words(String text){
        String  words[] =text.split(" ");
        return words.length+lines(text)-1;
    }
    public int chars(String text){
        return text.length();
    }
}
