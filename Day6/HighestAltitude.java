package Day6;

public class HighestAltitude {
    public int largestAltitude(int[] gain) {
        // int max=Integer.MIN_VALUE;
        // int high=0;
        // for(int i=0;i<gain.length;i++)
        // {
        //     high+=gain[i];
        //     if(high>max)max=high;
        // }
        // return max;
        int max=0;
        for(int i=1;i<gain.length;i++)
        {
            gain[i]=gain[i]+gain[i-1];
            //if(gain[i]>max)max=gain[i];
        }
        for(int altitude : gain){
            if(altitude > max)
                max = altitude;
        }
        return max;
    }
}
