package sorting;

public class Bubble extends SortFuncs implements Sorting {

    public Bubble() {
        super("Bubble");
    }

    @Override
    public void sort(int[] inputArray) {
        int temp = 0;

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray.length - i - 1; j++) {
                // check if the next element is greater than current
                if (inputArray[j] > inputArray[j + 1]) {
                    temp = inputArray[j + 1];
                    inputArray[j + 1] = inputArray[j];
                    inputArray[j] = temp;
                }
            }
        }
    }
}
