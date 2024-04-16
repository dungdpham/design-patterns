public class RoadTile implements Tile {
    private final String imagePath = "road.png";

    @Override
    public String getImagePath() {
        return imagePath;
    }

    @Override
    public TileType getType() {
        return TileType.ROAD;
    }
}
