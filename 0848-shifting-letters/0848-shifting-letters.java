class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        char[] a = s.toCharArray();
        int n = s.length();
        long totalShift = 0; 
        for (int i = n - 1; i >= 0; i--) {
            totalShift = (totalShift + shifts[i]) % 26;
            int newChar = ((a[i] - 'a' + (int)totalShift) % 26) + 'a';
            a[i] = (char)newChar;
        }
        
        return new String(a);
    }
}
