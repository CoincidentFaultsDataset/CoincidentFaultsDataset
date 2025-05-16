from collections import deque

class Node:
    def __init__(self, data):
        self.data = data
        self.left_child = None
        self.right_child = None

# Generating Magic Tree
def generate_enchanted_tree(seed, cycles):
    if cycles == 0:
        return None
    root_node = Node(seed)
    queue = deque([root_node])
    current_level = 0

    while queue and current_level < cycles:
        for _ in range(len(queue)):
            active_node = queue.popleft()
            active_node.left_child = Node("Y")
            active_node.right_child = Node("Y")
            queue.append(active_node.left_child)
            queue.append(active_node.right_child)
        current_level += 1
    return root_node

# Populating visualization grid
def fill_grid(root_node, depth, column, max_depth, grid):
    if not root_node:
        return 0
    spacing = 2 ** (max_depth - depth - 1)
    terminal_count = 0
    grid[max_depth - depth][column] = "Y"
    if not root_node.left_child and not root_node.right_child:
        terminal_count = 1
        grid[max_depth - depth][column] = "0"
    if root_node.left_child:
        terminal_count += fill_grid(root_node.left_child, depth + 1, column - spacing, max_depth, grid)
    if root_node.right_child:
        terminal_count += fill_grid(root_node.right_child, depth + 1, column + spacing, max_depth, grid)
    return terminal_count

# Building grid representation
def build_visualization(root_node, max_depth):
    grid_rows = max_depth + 1
    grid_columns = 2 ** (max_depth + 1) - 1
    visualization_grid = [['_'] * grid_columns for _ in range(grid_rows)]
    terminal_buds = fill_grid(root_node, 0, (grid_columns - 1) // 2, max_depth, visualization_grid)
    return visualization_grid, terminal_buds

# Displaying the grid
def display_grid(grid):
    for row in grid:
        print(" ".join(str(cell) for cell in row))

if __name__ == "__main__":
    # Interactive inputs
    tree_count = int(input("Enter the number of trees: "))
    tree_cycles = []
    for index in range(tree_count):
        cycle = int(input(f"Enter the cycles of tree {index + 1}: "))
        tree_cycles.append(cycle)

    total_buds = 0
    root_nodes = []  # List to hold all tree roots
    visualization_grids = []

    for cycle in tree_cycles:
        root = generate_enchanted_tree("Y", cycle)
        root_nodes.append([root, cycle])  # Store each root and its cycle count

    for tree_data in root_nodes:
        grid, bud_count = build_visualization(tree_data[0], tree_data[1])
        total_buds += bud_count
        visualization_grids.append(grid)

    print("\nTotal terminal buds: ", total_buds)
    print()
    for grid in visualization_grids:
        display_grid(grid)
        print()
