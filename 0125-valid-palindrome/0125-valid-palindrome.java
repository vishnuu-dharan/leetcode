class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(char i:s.toCharArray()){
            if(Character.isLetterOrDigit(i)){
                sb.append(i);
            }
        }
        String a=sb.toString();
        sb.reverse();
        String ans=sb.toString();

        return(ans.toLowerCase().equals(a.toLowerCase()));

        
    }
}