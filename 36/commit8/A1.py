from collections import deque
class TreeNode:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None 

# Creating Binary MagicTree 
def MagicTree(tree, age):
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
def populate_matrix(root, row, startcol, endcol, matrix):
    bud_counts = 0
    midpoint = (startcol+endcol)//2
    matrix[row][midpoint] = "Y"

    if not root.left and not root.right:# If it's a leaf node, mark it as 0
        bud_counts = 1
        matrix[row][midpoint] = "0"
    if root.left:# If it has left Child execute below code
        new_l_midpoint = (startcol+midpoint)//2 # Midpoint of the left part
        arrow_l_col = midpoint
        new_l_row = row
        while arrow_l_col>new_l_midpoint: # For Drawing left arrow
            arrow_l_col-=1
            new_l_row-=1
            matrix[new_l_row][arrow_l_col] = "\\"
        bud_counts += populate_matrix(root.left, new_l_row, startcol,midpoint, matrix)
    
    if root.right:# If it has right Child execute below code
        new_r_midpoint = (midpoint + 1 + endcol) // 2  
        arrow_r_col = midpoint
        new_r_row = row
        while arrow_r_col < new_r_midpoint:  # For Drawing right arrow
            arrow_r_col += 1
            new_r_row -= 1
            matrix[new_r_row][arrow_r_col] = "/"
        bud_counts += populate_matrix(root.right, new_r_row, midpoint + 1, endcol, matrix)

    return bud_counts
       
def traverseTree(root,height):
    # creating matrix and traversing binary tree
    rows = 2**height+1
    cols = 2*rows-3
    matrix = [["_"] * cols for _ in range(rows)]
    matrix[-1][(cols - 1) // 2] = "|"
    bud_counts=populate_matrix(root, -2,0, (cols - 1), matrix)
    return matrix,bud_counts

def printMatrix(matrix):
    for row in matrix:
        print(" ".join(str(cell) for cell in row))

if __name__ == "__main__":
    num_trees = int(input("Enter the number of trees: "))# Asking for the number of trees
    # Asking for the ages of the trees
    tree_ages = []
    print(f"Enter the ages of {num_trees} trees:")
    for i in range(num_trees):
        age = int(input(f"Age of tree {i + 1}: "))
        tree_ages.append(age)

    input = [num_trees, tree_ages]# Combining into the required format
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
    print()
    print("Total growth buds: ",Total_growthbuds)
    print()
    for matrix in matrices:
        printMatrix(matrix)
        print()

