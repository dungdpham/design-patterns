public abstract class Map {
    public void display() {
        Tile[][] mapTiles = new Tile[8][10];

        for (int row = 0; row < mapTiles.length; row++) {
            for (int column = 0; column < mapTiles[row].length; column++) {
                mapTiles[row][column] = createTile();
                System.out.print(mapTiles[row][column].getCharacter() + "  ");
            }
            System.out.println();
        }
    }

    public abstract Tile createTile();
}
