import java.util.*;

public class Solution {
  
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String one = "";
        String two = "";
        for(String s : word1){
          one+=s;
        }
        for(String s : word2){
          two+=s;
        }
        if(one.equals(two)){
          return true;
        }
        return false;
    }
  
}
