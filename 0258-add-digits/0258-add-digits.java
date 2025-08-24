class Solution {
    public int addDigits(int a) {
        
        while(a>9 ){
        int s=0;
        while (a>0){
            s+=(a%10);
            a/=10;

        }a=s;
        }
        return a;
    }
}