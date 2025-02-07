package Day3;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {1,3,4,23,56};
        //passing the reference variable, so the modifiactions apply on same object
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums)
    {
        nums[0]=99;
    }
}
