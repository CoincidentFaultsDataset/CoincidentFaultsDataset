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
    
