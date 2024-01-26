public class SwampTile implements Tile{
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    @Override
    public String getCharacter() {
        return ANSI_PURPLE + "S" + ANSI_RESET;
    }

    @Override
    public String getDescription() {
        return "Swamp";
    }
}
