class Solution:
    def compress(self, chars: List[str]) -> int:
        l=0
        r=0
        while l < len(chars):
            j=l
            while j < len(chars) and chars[j]== chars[l]:
                j+=1
            count = j-l
            # print(count,"++")
            chars[r]=chars[l]
            r+=1
            if count > 1:
                for i in str(count):
                    chars[r]=i
                    r+=1
            l=j
        return r
        