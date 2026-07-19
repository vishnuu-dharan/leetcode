class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        stack=deque()
        c=0
        max1=0
        for i in s:
            if i in stack:
                while i  in stack:
                    stack.popleft()
                    
                
             
            stack.append(i)
            
            max1=max(max1,len(stack))
        return max1
        