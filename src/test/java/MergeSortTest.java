import org.junit.Before;
import org.junit.Test;
import sorting.Merge;
import sorting.SortFuncs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MergeSortTest {

    private Merge merge;
    private int[] unsorted;

    @Before
    public void before() {
        merge = new Merge();
        unsorted = new int[]{100, 8, -25, 73, 716, 82, 12001, 0, -7, -7000};;
    }

    @Test
    public void hasNameMerge() {
        assertEquals("Merge", merge.getName());
    }

    @Test
    public void canSortUnsortedArray() {
        merge.sort(unsorted);
        assertTrue(SortFuncs.isSorted(unsorted));
    }
}
