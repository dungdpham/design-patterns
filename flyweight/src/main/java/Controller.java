import javafx.scene.image.Image;

public class Controller {
    private static final int GRID_WIDTH = 10;
    private static final int GRID_HEIGHT = 10;
    private Tile[][] tiles;
    private TileImage[][] tileImages;

    public Controller() {
        //Map map = new CityMap();
        Map map = new WildernessMap();

        tiles = map.createMap(GRID_HEIGHT, GRID_WIDTH);

        tileImages = new TileImage[GRID_HEIGHT][GRID_WIDTH];
        for (int i = 0; i < GRID_HEIGHT; i++) {
            for (int j = 0; j < GRID_WIDTH; j++) {
                tileImages[i][j] = TileImageFactory.getTileImage(tiles[i][j].getType());
            }
        }
    }

    public static int getGridHeight() {
        return GRID_HEIGHT;
    }

    public static int getGridWidth() {
        return GRID_WIDTH;
    }

    public Image getTileImage(int row, int col) {
        return tileImages[row][col].getImage();
    }
}
