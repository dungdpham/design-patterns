public class WaterTile implements Tile{
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    @Override
    public String getCharacter() {
        return ANSI_BLUE + "W" + ANSI_RESET;
    }

    @Override
    public String getDescription() {
        return "Water";
    }
}
