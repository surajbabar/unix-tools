package surajbab.unixTools;

public class Head {
    public String headContent(String fileContent , int count){
    String lines[] =fileContent.split("\r\n");
    String result="";
        for (int line = 0; line < count-1; line++)
                result+=lines[line]+"\r\n";
        result+=lines[count-1];
       return result;
    }
}