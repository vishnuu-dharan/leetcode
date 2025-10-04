class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
        for(char i:s.toCharArray()){
            if(i!=' '){

                sb.append(i);
            }
            else{
                sb1.append(sb.reverse());
                sb1.append(" ");
                sb.setLength(0);
            }
        }
        sb1.append(sb.reverse());
        String ab=sb1.toString();
        
        return(ab);
    }
}