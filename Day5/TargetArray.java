package Day5;
import java.util.ArrayList;

//question 
//https://leetcode.com/problems/create-target-array-in-the-given-order/

public class TargetArray {
     public int[] createTargetArray(int[] nums, int[] index) {
        int target[]=new int[nums.length];
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            list.add(index[i],nums[i]);
        }    
        for(int i=0;i<target.length;i++)
        {
            target[i]=list.get(i);
        }
        return target;
    }
}
