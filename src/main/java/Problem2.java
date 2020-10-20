public class Problem2 {

    /*
    Describe your algorithm here in up to 5 sentences:
     The method is supposed to make a temporary array
     where values that are not duplicated get stored in it.
     The for loop compares values in the array to find duplicates
     then stores in the temp array.
     */

    // Do not change signature (function name, parameters and return type)
    // Do not use extra space for another array. Solution to be in-pace with O(1) extra memory
    public static int remove(int[] nums) {

        if(nums.length == 0 || nums.length == 1){
            return -1;
        }
        int[] temp = new int[nums.length];
        int j = 0;
        for (int i=0; i<nums.length-1; i++){
            if (nums[i] != nums[i+1]){
                temp[j++] = nums[i];
            }
        }
        temp[j++] = nums[nums.length-1];
        for (int i=0; i<j; i++){
            nums[i] = temp[i];
        }
        return temp.length;
    }

}
