package sorting;

public abstract class SortFuncs implements Sorting {

    private String name;

    public SortFuncs(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    };

    // helper function - check array is sorted
    public static boolean isSorted(int[] inArray) {
        for (int i = 0; i < inArray.length - 2; i++) {
            if (inArray[i] > inArray[i + 1]) {
                return false;
            }
        }
        return true;
    }


}
