package Day5;

public class StringPangram {
    public boolean checkIfPangram(String sentence) {
        //     int alpha[]=new int[26];
        //  for(int i=0;i<sentence.length();i++)
        //  {
    
        //     if(!(sentence.charAt(i)>=97 && sentence.charAt(i)<=122)) 
        //     return false;
        //     alpha[sentence.charAt(i)-97]++;
        //  } 
        //  for(int i:alpha)
        //  {
        //     if(alpha[i]==0)return false;
        //  }
        //  return true;
    
        if(sentence.length()<26) return false;
            for(char ch='a';ch<='z';ch++){
                if(sentence.indexOf(ch)<0){
                    return false;
                }
             }
            return true;
        
        // Set set=new HashSet<>();
    
        // for(int i=0;i < sentence.length(); i++)
        // {
        //     set.add(sentence.charAt(i));
        // }
        // return set.size()==26;
        }
}
