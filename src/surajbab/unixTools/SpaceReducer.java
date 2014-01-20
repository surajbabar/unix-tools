package surajbab.unixTools;

public class SpaceReducer {
    public String reduceSpaces(String fileContent) {
        return fileContent.replaceAll(" +", " ");
    }
}
