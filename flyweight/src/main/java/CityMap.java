import java.util.Random;

public class CityMap extends Map {
    @Override
    public Tile createTile() {
        Random random = new Random();
        int tileType = random.nextInt(3);

        switch (tileType) {
            case 0:
                return new BuildingTile();
            case 1:
                return new RoadTile();
            case 2:
                return new ForestTile();
            default:
                return null;
        }
    }
}
