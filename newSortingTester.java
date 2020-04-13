import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class newSortingTester {

    /*
     * tests an already sorted array of odd length
     * TEST: PASSED
     */
    @Test
    public void newSortingTest1(){
        newSorting ns = new newSorting();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int[] expected = {1, 2, 3, 4, 5, 6, 7};
        ns.newSorting(nums,2);

        assertArrayEquals(expected, nums);
    }

    /*
     * tests an unsorted array of even length with duplicate values
     * TEST: PASSED
     */

    @Test
    public void newSortingTest2(){
        newSorting ns = new newSorting();
        int[] nums = {6,3,1,7,2,1,9,4,5,7};
        int[] expected = {1,1,2,3,4,5,6,7,7,9};
        ns.newSorting(nums,4);

        assertArrayEquals(expected, nums);
    }

    /*
     * tests if the method works with negative numbers
     * TEST: PASSED
     */
    @Test
    public void newSortingTest3(){
        newSorting ns = new newSorting();
        int[] nums = {-1,2,-3,4,-5};
        int[] expected = {-5,-3,-1,2,4};
        ns.newSorting(nums,2);

        assertArrayEquals(expected, nums);
    }

    /*
     * tests the array with negative numbers, an array of even length with a larger size than the other tests
     * TEST: PASSED
     */
    @Test
    public void newSortingTest4(){
        newSorting ns = new newSorting();
        int[] nums = {-2,19,7,8,5,3,1,0,10,15,-4,-1,9,-2,2,3};
        int[] expected = {-4,-2,-2,-1,0,1,2,3,3,5,7,8,9,10,15,19};
        ns.newSorting(nums,4);

        assertArrayEquals(expected, nums);
    }


    /*
     * Tests to see if the method still runs with an empty array
     * TEST: PASSED
     */
    @Test
    public void newSortingTest5(){
        newSorting ns = new newSorting();
        int[] nums = {};
        int[] expected = {};
        ns.newSorting(nums,4);

        assertArrayEquals(expected, nums);
    }

}