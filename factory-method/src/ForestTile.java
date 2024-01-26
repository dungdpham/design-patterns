public class ForestTile implements Tile{
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    @Override
    public String getCharacter() {
        return ANSI_GREEN + "F" + ANSI_RESET;
    }

    @Override
    public String getDescription() {
        return "Forest";
    }
}
