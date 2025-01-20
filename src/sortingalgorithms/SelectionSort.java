package sortingalgorithms;

public class SelectionSort implements Sorter {

    @Override
    public int[] sort(int[] data) {
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            // Assume the current position holds the minimum element
            int min_idx = i;

            // Iterate through the unsorted portion to find the actual minimum
            for (int j = i + 1; j < n; j++) {
                if (data[j] < data[min_idx]) {
                    // Update min_idx if a smaller element is found
                    min_idx = j;
                }
            }

            // Move minimum element to its correct position
            int temp = data[i];
            data[i] = data[min_idx];
            data[min_idx] = temp;

        }
        return data;
    }
}
