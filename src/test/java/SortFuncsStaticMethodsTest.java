import org.junit.Test;
import sorting.SortFuncs;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SortFuncsStaticMethodsTest {

    private int[] unsorted = {-1, 5, -22, 3, 108, -651536, -2147483648, 4838, 219, 2147483647, 20, 0};
    private int[] sorted = {-2147483648, -651536, -22, -1, 0, 3, 5, 20, 108, 219, 4838, 2147483647};

    @Test
    public void canIdentifyUnsortedIntArray() {
        assertFalse(SortFuncs.isSorted(unsorted));
    }

    @Test
    public void canIdentifySortedIntArray() {
        assertTrue(SortFuncs.isSorted(sorted));
    }
}
