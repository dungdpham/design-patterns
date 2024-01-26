public class BuildingTile implements Tile{
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    @Override
    public String getCharacter() {
        return ANSI_RED + "B" + ANSI_RESET;
    }

    @Override
    public String getDescription() {
        return "Building";
    }
}
