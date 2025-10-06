class Solution {
    public String replaceDigits(String s) {
        char[] ab=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(ab[i])){
                ab[i]=(char)(ab[i-1]+(ab[i]-'0'));
            }
        }
        String re = new String(ab); 
        return re;
    }
}