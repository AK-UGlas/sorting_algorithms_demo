package sorting;

public class Merge extends SortFuncs implements Sorting {

    public Merge() {
        super("Merge");
    }

    @Override
    public void sort(int[] inputArray) {
        mergeSort(inputArray, 0, inputArray.length);
    }

    private void mergeSort(int[] inputArray, int start, int end) {
        // the recursion-breaking step - we have one element in the array
        if (end - start < 2) {
            return;
        }

        //Splitting phase (divide and conquer):
        // Divide the array into 2 unsorted partitions - left and right
        int mid = (start + end) / 2;

        mergeSort(inputArray, start, mid); // left partition
        mergeSort(inputArray, mid, end); // right partition

        // Sort and merge the two partitions
        merge(inputArray, start, mid, end);
    }

    // merge sort inner function
    // the sorting part of mergesort
    private void merge(int[] inArray, int start, int mid, int end) {

        // small optimisation - if the two values surrounding mid are already sorted, the whole thing is sorted and
        // we can return
        if (inArray[mid - 1] <= inArray[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIdx = 0;

        // create temporary array
        int[] temp = new int[end - start];

        while (i < mid && j < end) {
            temp[tempIdx] = inArray[i] <= inArray[j] ? inArray[i++] : inArray[j++];
            tempIdx++;
        }

        // copy the leftover items (if any)
        System.arraycopy(inArray, i, inArray, start+tempIdx, mid-i);

        // copy temp array into the input array
        for (int k = 0; k < tempIdx; k++) {
            inArray[start + k] = temp[k];
        }
    }
}
