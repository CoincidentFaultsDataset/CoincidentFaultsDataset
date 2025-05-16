from collections import deque

class Tree:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

# Generate the tree structure based on input age
def create_tree(node_value, depth):
    root = Tree(node_value)
    queue = deque([root])
    current_level = 0

    while queue and current_level < depth:
        for _ in range(len(queue)):
            current_node = queue.popleft()
            current_node.left = Tree("Y")
            current_node.right = Tree("Y")
            queue.append(current_node.left)
            queue.append(current_node.right)
        current_level += 1
    return root

# Populate the visualization matrix for the tree
def build_matrix(node, row, col, max_depth, matrix):
    offset = 2 ** (max_depth - row - 1)  # Offset for child nodes
    total_buds = 0

    # Place the node or mark it as a leaf
    if node:
        matrix[-(2 * row + 1)][col] = "Y"
        if not node.left and not node.right:
            matrix[-(2 * row + 1)][col] = "0"
            total_buds += 1
        else:
            if node.left:
                matrix[-(2 * row + 2)][col - offset] = "\\"
                total_buds += build_matrix(node.left, row + 1, col - offset, max_depth, matrix)
            if node.right:
                matrix[-(2 * row + 2)][col + offset] = "/"
                total_buds += build_matrix(node.right, row + 1, col + offset, max_depth, matrix)
    return total_buds

# Generate and visualize the tree
def visualize_tree(tree_root, tree_depth):
    rows = 2 * (tree_depth + 1) - 1
    cols = 2 ** (tree_depth + 1) - 1
    canvas = [["_" for _ in range(cols)] for _ in range(rows)]
    total_buds = build_matrix(tree_root, 0, (cols - 1) // 2, tree_depth, canvas)
    return canvas, total_buds

# Print the tree visualization
def display_canvas(canvas):
    for line in canvas:
        print(" ".join(line))

if __name__ == "__main__":
    # Gather tree input details
    num_trees = int(input("How many trees do you want to create? "))
    tree_ages = []
    for t in range(num_trees):
        age = int(input(f"Enter age for Tree {t + 1}: "))
        tree_ages.append(age)

    total_buds = 0
    tree_visuals = []

    for age in tree_ages:
        tree = create_tree("Y", age)
        canvas, buds = visualize_tree(tree, age)
        total_buds += buds
        tree_visuals.append(canvas)

    print(f"Total Buds across all trees: {total_buds}")
    print("\nTree Visualizations:\n")
    for canvas in tree_visuals:
        display_canvas(canvas)
        print()
