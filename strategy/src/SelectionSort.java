// Source code obtained from https://www.geeksforgeeks.org/selection-sort/

public class SelectionSort implements SortStrategy {
    @Override
    public int[] sort(int[] array) {
        int[] newArray = array.clone();

        int n = newArray.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_index = i;
            for (int j = i+1; j < n; j++)
                if (newArray[j] < newArray[min_index])
                    min_index = j;

            // Swap the found minimum element with the first element
            int temp = newArray[min_index];
            newArray[min_index] = newArray[i];
            newArray[i] = temp;
        }

        return newArray;
    }
}
