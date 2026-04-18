import java.util.ArrayList;
class Solution {

    public int maxDistinct(String s) {
        char arr[] = s.toCharArray();
        int count=0;
        ArrayList<Character> ch = new ArrayList<>();
        int in=0;
        for (char i : arr){
            if(!ch.contains(i)){
                ch.add(i);
                count++;
        }
        }
        return count;
    }
}