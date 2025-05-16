from collections import deque
from math import floor
class TreeNode:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None 

# Creating Binary MagicTree 
def MagicTree(tree, age):
    if age == 0:
        return 0 
    root = TreeNode(tree) 
    q = deque([root])
    bfs_level = 0

    while q and bfs_level<age:
        for i in range (len(q)):
            current = q.popleft()
            current.left = TreeNode("Y")
            current.right = TreeNode("Y")
            q.append(current.left)
            q.append(current.right)
        bfs_level+=1
    return root

# Filling the matrix for displaying the tree
def populate_matrix(root, row, col, height, matrix):
    if not root:
        return 0  
    offset = 2 ** (height - row - 1)  # This is the distance to child nodes
    bud_counts = 0
    matrix[2 * row][col] = "Y"  # Nodes are placed at even rows
    # If it's a leaf node, mark it as 0
    if not root.left and not root.right:
        bud_counts = 1
        matrix[2 * row][col] = "0"
    # If it has left Child execute below code
    if root.left:
        matrix[2 * row + 1][col - offset] = "/"  # Left arrow
        bud_counts += populate_matrix(root.left, row + 1, col - offset, height, matrix)
    # If it has right Child execute below code
    if root.right:
        matrix[2 * row + 1][col + offset] = "\\"  # Right arrow
        bud_counts += populate_matrix(root.right, row + 1, col + offset, height, matrix)

    return bud_counts
       
def traverseTree(root,height):
    # creating matrix and traversing binary tree
    rows = 2 * (height + 1) - 1  # Extra rows for arrows
    cols = 2 ** (height + 1) - 1
    matrix = [["_"] * cols for _ in range(rows)]
    bud_counts=populate_matrix(root, 0, (cols - 1) // 2, height, matrix)
    return matrix,bud_counts

def printMatrix(matrix):
    for row in matrix:
        print(" ".join(str(cell) for cell in row))
    # print("total buds is : ",bud_counts)


if __name__ == "__main__":
    # This is input to the algorithm where first 2 is number of tree and [1,2] is the age of the trees
    input = [2,[3,4]]
    Total_growthbuds = 0
    all_trees = []  # List to store all root nodes of trees
    matrices = []

    for i in range(1,input[0]+1):
        root = MagicTree("Y",input[1][i-1])
        all_trees.append([root,input[1][i-1]])  # Storing each root node
    for a in all_trees:
        matrix,bud_counts = traverseTree(a[0],a[1])
        Total_growthbuds+=bud_counts
        matrices.append(matrix)

    print("Total growth buds: ",Total_growthbuds)
    print()
    for matrix in matrices:
        printMatrix(matrix)
        print()

