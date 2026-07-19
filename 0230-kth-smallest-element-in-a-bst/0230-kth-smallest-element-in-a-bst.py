# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def kthSmallest(self, root, k):
        stack=[]
        def dfs(root):
            if root==None: return
            dfs(root.left)
            stack.append(root.val)
            dfs(root.right)
        dfs(root)
        return stack[k-1]

        """
        :type root: Optional[TreeNode]
        :type k: int
        :rtype: int
        """
        