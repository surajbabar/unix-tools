package surajbab.unixTools.wc;

import surajbab.unixTools.lib.Text;
import surajbab.unixTools.lib.File;


public class WC {
	public static void main(String[] args) {
    String filename =args[0];
	String fileContent;

    File file = new File();
    Text text = new Text();

    fileContent = file.readFile(filename);

    int lines =text.lines(fileContent);
    int words =text.words(fileContent);
	int chars =text.chars(fileContent);

	System.out.print("   "+lines+"\t"+words+"\t"+chars+"\t"+filename);
	}
}
