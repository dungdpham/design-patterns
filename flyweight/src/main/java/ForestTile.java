public class ForestTile implements Tile {
    private final String imagePath = "forest.png";

    @Override
    public String getImagePath() {
        return imagePath;
    }

    @Override
    public TileType getType() {
        return TileType.FOREST;
    }
}
