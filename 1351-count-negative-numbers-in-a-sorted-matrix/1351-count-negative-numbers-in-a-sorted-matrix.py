class Solution(object):
    def countNegatives(self, grid):
        c=0
        while grid:
            for i in grid.pop():
                    print(i,'+')
                    if i<0: c+=1
        return c
        
        