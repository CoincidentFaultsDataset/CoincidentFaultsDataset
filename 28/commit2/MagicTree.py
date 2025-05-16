from collections import deque

class Node:
    def __init__(self, data):
        self.data = data
        self.left_child = None
        self.right_child = None

def create_tree(seed, max_depth):
    if max_depth == 0:
        return 0

    root_node = Node(seed)
    node_queue = deque([root_node])
    current_depth = 0
    last_level_buds = 0
    traversal_step = 0

    while node_queue and current_depth <= max_depth:
        nodes_in_level = len(node_queue)

        for _ in range(nodes_in_level):
            active_node = node_queue.popleft()

            # Creating left and right descendants for the active node
            active_node.left_child = Node(f"{root_node.data}L{traversal_step + 1}")
            active_node.right_child = Node(f"{root_node.data}R{traversal_step + 1}")

            # Adding descendants to the queue for the next level
            node_queue.append(active_node.left_child)
            node_queue.append(active_node.right_child)

            print(f"Active Node: {active_node.data}, Step: {traversal_step}")

        last_level_buds = nodes_in_level
        current_depth += 1
        traversal_step += 1

    return root_node, last_level_buds

def main_program():
    input_values = [2, [1, 3]]
    buds_sum = 0
    tree_collection = []

    for index in range(1, input_values[0] + 1):
        root, buds_in_tree = create_tree(index, input_values[1][index - 1])
        tree_collection.append((root, input_values[1][index - 1]))  # Store the root node and max depth
        buds_sum += buds_in_tree

    print("Total Buds Growth:", buds_sum)

if __name__ == "__main__":
    main_program()
