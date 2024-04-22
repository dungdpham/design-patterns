import java.util.EnumMap;
import java.util.Map;

public class TileImageFactory {
    private static final Map<TileType, TileImage> images = new EnumMap<>(TileType.class);

    public static TileImage getTileImage(Tile tile) {
        TileImage tileImage = images.get(tile.getType());

        if (tileImage == null) {
//            Tile tile;
//            switch (type) {
//                case BUILDING:
//                    tile = new BuildingTile();
//                    tileImage = new TileImage(tile.getImagePath(), tile.getType());
//                    break;
//                case FOREST:
//                    tile = new ForestTile();
//                    tileImage = new TileImage(tile.getImagePath(), tile.getType());
//                    break;
//                case ROAD:
//                    tile = new RoadTile();
//                    tileImage = new TileImage(tile.getImagePath(), tile.getType());
//                    break;
//                case WATER:
//                    tile = new WaterTile();
//                    tileImage = new TileImage(tile.getImagePath(), tile.getType());
//                    break;
//                case SWAMP:
//                    tile = new SwampTile();
//                    tileImage = new TileImage(tile.getImagePath(), tile.getType());
//                    break;
//            }
//            images.put(type, tileImage);
            tileImage = new TileImage(tile.getImagePath(), tile.getType());
            images.put(tile.getType(), tileImage);
        }

        return tileImage;
    }
}
