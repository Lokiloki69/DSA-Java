package Day5;

//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
public class Smaller {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int res[]=new int[nums.length];
        int count[]=new int[101];
        for(int i=0;i<nums.length;i++)
        {
            count[nums[i]]++;
        }

        for(int i=1;i<=100;i++)
        {
            count[i]+=count[i-1];
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)res[i]=0;
            else res[i]=count[nums[i]-1];
        }
        return res; 
    }
}
