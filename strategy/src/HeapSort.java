// Source code obtained from https://www.geeksforgeeks.org/heap-sort/

public class HeapSort implements SortStrategy {
    @Override
    public int[] sort(int[] array) {
        int[] newArray = array.clone();
        
        int n = newArray.length;

        // Build heap (rearrange array)
        for (int i = n/2 - 1; i >= 0; i--)
            heapify(newArray, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = newArray[0];
            newArray[0] = newArray[i];
            newArray[i] = temp;

            // Call max heapify on the reduced heap
            heapify(newArray, i, 0);
        }
        
        return newArray;
    }

    // To heapify a subtree rooted with node i which is an index in arr[], n is size of heap
    void heapify(int[] arr, int n, int i) {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected subtree
            heapify(arr, n, largest);
        }
    }
}
