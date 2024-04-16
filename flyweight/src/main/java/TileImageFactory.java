import java.util.EnumMap;
import java.util.Map;

public class TileImageFactory {
    private static final Map<TileType, TileImage> images = new EnumMap<>(TileType.class);

    public static TileImage getTileImage(TileType type) {
        TileImage image = images.get(type);

        if (image == null) {
            Tile tile;
            switch (type) {
                case BUILDING:
                    tile = new BuildingTile();
                    image = new TileImage(tile.getImagePath(), tile.getType());
                    break;
                case FOREST:
                    tile = new ForestTile();
                    image = new TileImage(tile.getImagePath(), tile.getType());
                    break;
                case ROAD:
                    tile = new RoadTile();
                    image = new TileImage(tile.getImagePath(), tile.getType());
                    break;
                case WATER:
                    tile = new WaterTile();
                    image = new TileImage(tile.getImagePath(), tile.getType());
                    break;
                case SWAMP:
                    tile = new SwampTile();
                    image = new TileImage(tile.getImagePath(), tile.getType());
                    break;
            }
            images.put(type, image);
        }

        return image;
    }
}
