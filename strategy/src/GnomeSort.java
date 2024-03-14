// Source code obtained from https://www.geeksforgeeks.org/gnome-sort-a-stupid-one/

public class GnomeSort implements SortStrategy {
    @Override
    public int[] sort(int[] array) {
        int[] newArray = array.clone();

        int n = newArray.length;
        int index = 0;

        while (index < n) {
            if (index == 0)
                index++;

            if (newArray[index] >= newArray[index - 1]) {
                index++;
            } else {
                int temp = newArray[index];
                newArray[index] = newArray[index - 1];
                newArray[index - 1] = temp;
                index--;
            }
        }

        return newArray;
    }
}
