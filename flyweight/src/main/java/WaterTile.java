public class WaterTile implements Tile {
    private final String imagePath = "water.png";

    @Override
    public String getImagePath() {
        return imagePath;
    }

    @Override
    public TileType getType() {
        return TileType.WATER;
    }
}
