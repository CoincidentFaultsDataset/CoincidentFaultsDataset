from collections import deque

class TreeNode:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

def magic_tree(tree, max_age):
    if max_age == 0:
        return 0

    root = TreeNode(tree)
    queue = deque([root])
    current_height = 0
    total_growth_buds = 0
    bfs_level = 0

    while queue and current_height <= max_age:
        nodes_at_current_level = len(queue)

        for _ in range(nodes_at_current_level):
            current_node = queue.popleft()

            # Creating left and right children for the current node
            current_node.left = TreeNode(f"{root.value}L{bfs_level + 1}")
            current_node.right = TreeNode(f"{root.value}R{bfs_level + 1}")

            # Adding children to the queue for the next level
            queue.append(current_node.left)
            queue.append(current_node.right)

            print(f"Current Node: {current_node.value}, Level: {bfs_level}")

        total_growth_buds = nodes_at_current_level
        current_height += 1
        bfs_level += 1

    return root, total_growth_buds

def main():
    input_data = [2, [1, 3]]
    total_growth_buds = 0
    all_trees = []

    for i in range(1, input_data[0] + 1):
        root, growth_buds_count = magic_tree(i, input_data[1][i - 1])
        all_trees.append((root, input_data[1][i - 1]))  # Store the root node and its max age
        total_growth_buds += growth_buds_count

    print("Total Growth Buds:", total_growth_buds)

if __name__ == "__main__":
    main()
