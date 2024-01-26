import java.util.Scanner;

public class Game {
    public static String mapType;

    public static Map createMap() {
        switch (mapType) {
            case "1":
                return new CityMap();
            case "2":
                return new WildernessMap();
            default:
                throw new IllegalArgumentException("Unknown map type.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map map;

        boolean isRunning = true;
        while (isRunning) {
            System.out.print("\nPlease choose: 1 - City Map, 2 - Wilderness Map, q - quit: ");
            mapType = scanner.nextLine();

            switch (mapType.toLowerCase()) {
                case "q":
                    isRunning = false;
                    break;
                case "1":
                case "2":
                    map = createMap();
                    map.display();
                    break;
                default:
                    System.out.println("Invalid input.");
            }
        }
    }
}
