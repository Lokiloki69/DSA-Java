package Day5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
public class Candies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list=new ArrayList<Boolean>(Arrays.asList(new Boolean[candies.length]));
        Collections.fill(list, false);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++)
        {
            if(max< candies[i]) max=candies[i];
        }
        for(int i=0;i<candies.length;i++)
        {
            if((candies[i] + extraCandies) >= max) list.set(i,true);
        }
        return list;
    }
}
