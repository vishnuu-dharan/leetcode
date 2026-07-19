class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        
        """
        list1=[]
        row=len(matrix)
        col=len(matrix[0])
        for i in range(row):
            for j in range(col):
                if matrix[i][j]==0:
                    list1.append((i,j))
        for r,c in list1:
            i=0
            j=0
            while i < row:
                matrix[i][c]=0
                i+=1
            while j<col:
                matrix[r][j]=0
                j+=1