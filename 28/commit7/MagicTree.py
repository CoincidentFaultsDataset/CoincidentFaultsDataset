from collections import deque

class Node:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

# Generate a Binary Tree with specific structure
def create_magic_tree(value, depth):
    root = Node(value)
    queue = deque([root])
    current_level = 0

    while queue and current_level < depth:
        for _ in range(len(queue)):
            current = queue.popleft()
            current.left = Node("Y")
            current.right = Node("Y")
            queue.append(current.left)
            queue.append(current.right)
        current_level += 1
    return root

# Helper function to build a matrix for tree visualization
def build_matrix(node, level, col_start, col_end, grid):
    bud_count = 0
    midpoint = (col_start + col_end) // 2
    grid[level][midpoint] = "Y"

    if not node.left and not node.right:  # Leaf node check
        grid[level][midpoint] = "O"
        return 1

    if node.left:
        left_mid = (col_start + midpoint) // 2
        temp_col, temp_row = midpoint, level
        while temp_col > left_mid:
            temp_col -= 1
            temp_row -= 1
            grid[temp_row][temp_col] = "\\"
        bud_count += build_matrix(node.left, temp_row, col_start, midpoint, grid)

    if node.right:
        right_mid = (midpoint + col_end + 1) // 2
        temp_col, temp_row = midpoint, level
        while temp_col < right_mid:
            temp_col += 1
            temp_row -= 1
            grid[temp_row][temp_col] = "/"
        bud_count += build_matrix(node.right, temp_row, midpoint + 1, col_end, grid)

    return bud_count

# Traverse and prepare the tree structure in grid form
def process_tree(root, depth):
    total_rows = 2 ** depth + 1
    total_cols = 2 * total_rows - 3
    grid = [["_"] * total_cols for _ in range(total_rows)]
    grid[-1][(total_cols - 1) // 2] = "|"
    bud_count = build_matrix(root, total_rows - 2, 0, total_cols - 1, grid)
    return grid, bud_count

# Utility to display the grid
def display_grid(grid):
    for row in grid:
        print(" ".join(row))

if __name__ == "__main__":
    tree_count = int(input("Enter the no. of trees: "))
    tree_depths = []
    print(f"Enter the age of {tree_count} trees:")
    for i in range(tree_count):
        depth = int(input(f"Age of tree {i + 1}: "))
        tree_depths.append(depth)

    total_buds = 0
    trees = []
    grids = []

    for depth in tree_depths:
        tree_root = create_magic_tree("Y", depth)
        trees.append((tree_root, depth))

    for root, depth in trees:
        grid, bud_count = process_tree(root, depth)
        total_buds += bud_count
        grids.append(grid)

    print("\nTotal growth buds:", total_buds)
    print()
    for grid in grids:
        display_grid(grid)
        print()
