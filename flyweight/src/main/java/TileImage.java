import javafx.scene.image.Image;

public class TileImage implements Flyweight {
    private final Image image;
    private final TileType type;

    public TileImage(String imagePath, TileType type) {
        this.image = new Image(imagePath);
        this.type = type;
    }

    @Override
    public Image getImage() {
        return image;
    }

    @Override
    public TileType getType() {
        return type;
    }
}
