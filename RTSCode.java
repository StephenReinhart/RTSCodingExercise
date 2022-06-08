import java.util.*;

public class RTSCode {
    
    public HashMap<String, Integer> aboveBelow(List<Integer> nums, int comp) {
        int above = 0;
        int below = 0;
        
        for (int i : nums) {
            if      (i < comp) below++;
            else if (i > comp) above++;
        }
        
        HashMap<String, Integer> output = new HashMap<String, Integer>();
        output.put("above", above);
        output.put("below", below);
        
        return output;
    }
    
    public String stringRotation(String og, int rotation) { // to the Right
        return og.substring(og.length() - rotation) + og.substring(0, og.length() - rotation);
    }
    
    public static void main(String args[]) {
        RTSCode rtsc = new RTSCode();
        
        //Example 1
        Integer[] abNums = {1, 5, 2, 1, 10};
        int comp = 6;
        HashMap<String, Integer> abOutput = rtsc.aboveBelow(Arrays.asList(abNums), comp);
        System.out.println(Arrays.asList(abOutput)); // "[{below=4, above=1}]"
        
        System.out.println();
        
        //Example 2
        String myString = "MyString";
        int rotation = 2;
        String srOutput = rtsc.stringRotation(myString, rotation);
        System.out.println(srOutput); // "ngMyStri"
    }
}