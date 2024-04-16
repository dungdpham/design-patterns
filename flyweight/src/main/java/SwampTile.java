public class SwampTile implements Tile {
    private final String imagePath = "swamp.png";

    @Override
    public String getImagePath() {
        return imagePath;
    }

    @Override
    public TileType getType() {
        return TileType.SWAMP;
    }
}
