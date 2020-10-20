public class Problem1 {

    /*
    Describe your algorithm here in up to 5 sentences:
    To sort the array, a temporary variable needs to be made to
    store an integer so that it may be moved. The use of 2 for
    loops allows for one integer to be compared to the next in the
    array. The last for loop prints the sorted array.
     */

    // Do not change signature (function name, parameters type, and return type)
    public static void colorSort(int[] nums) {

        int temp = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] > nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        System.out.println();

        //Displaying elements of array after sorting
        System.out.println("Sorted Array: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
