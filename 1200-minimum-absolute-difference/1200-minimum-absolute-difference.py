class Solution(object):
    def minimumAbsDifference(self, arr):
        arr.sort()
        res=[]
        max1=float('inf')
        for i in range(1,len(arr)):
            max1=min(max1,abs(arr[i]-arr[i-1]))
        for i in range(len(arr)-1):
            if max1==abs(arr[i]-arr[i+1]):
                res.append([arr[i],arr[i+1]])
        return res


