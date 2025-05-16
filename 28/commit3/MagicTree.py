from collections import deque

# Definition of a Node in the binary tree
class Node:
    def __init__(self, data):
        self.data = data  # The value stored in the node
        self.left_child = None  # Pointer to the left child node
        self.right_child = None  # Pointer to the right child node

def create_tree(seed, max_depth):
    """
    Creates a binary tree starting from a root node with the given seed value.

    Args:
        seed (int): The value for the root node.
        max_depth (int): The maximum depth of the binary tree.

    Returns:
        tuple: The root node of the tree and the number of nodes in the last level.
    """
    if max_depth == 0:
        return 0  # If max depth is 0, none of the tree is created.

    # Initializing the root node
    root_node = Node(seed)

    # Queue to manage nodes at each level during tree construction
    node_queue = deque([root_node])

    current_depth = 0  # Tracks the current depth of the tree
    last_level_buds = 0  # Stores the number of nodes in the last level
    traversal_step = 0  # Step count for naming child nodes

    while node_queue and current_depth <= max_depth:
        nodes_in_level = len(node_queue)  # Number of nodes at the current level

        for _ in range(nodes_in_level):
            # Process each node at the current level
            active_node = node_queue.popleft()

            # Create left and right children for the active node
            active_node.left_child = Node(f"{root_node.data}L{traversal_step + 1}")
            active_node.right_child = Node(f"{root_node.data}R{traversal_step + 1}")

            node_queue.append(active_node.left_child)
            node_queue.append(active_node.right_child)

            # Print the active node and current step for debugging
            print(f"Active Node: {active_node.data}, Step: {traversal_step}")

        # Update the count of nodes at the last level
        last_level_buds = nodes_in_level
        
        # Move to the next depth level
        current_depth += 1
        
        traversal_step += 1

    return root_node, last_level_buds

def main_program():
    """
    Main program to create multiple trees and calculate the total number of nodes in the last levels.
    """
    # Input values: [number of trees, list of maximum depths for each tree]
    input_values = [2, [1, 3]]
    buds_sum = 0  # Total count of nodes in the last levels of all trees
    tree_collection = []  
    for index in range(1, input_values[0] + 1):
        # Creating a tree with the specified root index and depth
        root, buds_in_tree = create_tree(index, input_values[1][index - 1])

        # Storing the tree root and its maximum depth
        tree_collection.append((root, input_values[1][index - 1]))

        # calculating the number of nodes in the last level
        buds_sum += buds_in_tree

    # Printing the total number of nodes in the last levels in all the trees
    print("Total Buds Growth:", buds_sum)

if __name__ == "__main__":
    main_program()