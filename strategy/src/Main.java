import java.util.Random;

public class Main {
    static Random random = new Random();

    public static int[] arrayGen(int length) {
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt();
        }

        return array;
    }

    public static double measureSortTimeMs(SortContext sortContext, int[] array) {
        long startTime = System.nanoTime();
        sortContext.sort(array);
        long endTime = System.nanoTime();

        return (double) (endTime - startTime)/1000000;
    }

    public static void main(String[] args) {
        int[] smallArr = arrayGen(30);
        int[] largeArr = arrayGen(100000);

        System.out.println("Small array:");

        SortContext sortContext = new SortContext(new SelectionSort());
        System.out.println("Selection sorted: " + measureSortTimeMs(sortContext, smallArr) + "ms");
        sortContext.setSortStrategy(new HeapSort());
        System.out.println("Heap sorted: " + measureSortTimeMs(sortContext, smallArr) + "ms");
        sortContext.setSortStrategy(new GnomeSort());
        System.out.println("Gnome sorted: " + measureSortTimeMs(sortContext, smallArr) + "ms");

        System.out.println("\nLarge array:");

        sortContext.setSortStrategy(new SelectionSort());
        System.out.println("Selection sorted: " + measureSortTimeMs(sortContext, largeArr) + "ms");
        sortContext.setSortStrategy(new HeapSort());
        System.out.println("Heap sorted: " + measureSortTimeMs(sortContext, largeArr) + "ms");
        sortContext.setSortStrategy(new GnomeSort());
        System.out.println("Gnome sorted: " + measureSortTimeMs(sortContext, largeArr) + "ms");

    }
}
