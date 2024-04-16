public class BuildingTile implements Tile {
    private final String imagePath = "building.png";

    @Override
    public String getImagePath() {
        return imagePath;
    }

    @Override
    public TileType getType() {
        return TileType.BUILDING;
    }
}
