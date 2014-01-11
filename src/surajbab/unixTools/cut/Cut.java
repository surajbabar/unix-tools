package surajbab.unixTools.cut;

public class Cut {
    public String getFields(String file,int field,String delimitor) {
        String result ="",words[];
        String lines[] = file.split("\r\n");
        for (String line : lines) {
            words =line.split(delimitor);
            if(words.length>=field){
                System.out.println("asdf");
            result = result.concat(words[field - 1]);
            }
            result =result.concat("\r\n");
        }
        return result;
    }
}