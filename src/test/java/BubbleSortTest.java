import org.junit.Before;
import org.junit.Test;
import sorting.Bubble;
import sorting.SortFuncs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BubbleSortTest {

    private Bubble bubble;
    private int[] unsorted;

    @Before
    public void before() {
        bubble = new Bubble();
        unsorted = new int[]{100, 8, -25, 73, 716, 82, 12001, 0, -7, -7000};;
    }

    @Test
    public void hasNameBubble() {
        assertEquals("Bubble", bubble.getName());
    }

    @Test
    public void canSortUnsortedArray() {
        bubble.sort(unsorted);
        assertTrue(SortFuncs.isSorted(unsorted));
    }
}
