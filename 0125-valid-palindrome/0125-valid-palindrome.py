class Solution(object):
    def isPalindrome(self, s):
        li=[ i.lower()  for i in s if i.isalpha()]
        return li[::-1]==li