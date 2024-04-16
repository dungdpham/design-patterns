public abstract class Map {

    public Tile[][] createMap(int row, int column) {
        Tile[][] tiles = new Tile[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                tiles[i][j] = createTile();
            }
        }
        return tiles;
    }

    public abstract Tile createTile();
}
