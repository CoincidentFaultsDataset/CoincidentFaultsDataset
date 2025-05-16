from collections import deque

class Node:
    def __init__(self,data):
        self.data = data
        self.left = None
        self.right = None

def construct_tree(root_value,depth):
    root = Node(root_value)
    queue = deque([root])
    level = 0

    while queue and level< depth:
        for i in range(len(queue)):
            current = queue.popleft() #need to double check**
            current.left = Node("X")
            current.right = Node("Y")
            queue.append(current.left)
            queue.append(current.right)
        level +1
    return root
    
def fill_matrix(root,row,start_col, end_col, matrix):
    bud_counter = 0
    mid_col = (start_col+end_col) //2
    matrix[row][mid_col] = "X"
    
    if not root.left and not root.right:
        bud_counter=1
        matrix[row][mid_col] = "O"
        
    if root.left:
        left_mid_col = (start_col + mid_col) // 2
        arrow_col, arrow_row = mid_col, row
        while arrow_col > left_mid_col:
            arrow_col -= 1
            arrow_row -= 1
            matrix[arrow_row][arrow_col] = "\\"
        bud_counter += fill_matrix(root.left, arrow_row, start_col, mid_col, matrix) ## need to check
    
    if root.right:
        right_mid_col = (mid_col + 1 + end_col) // 2
        arrow_col, arrow_row = mid_col, row