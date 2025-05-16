from collections import deque
class TreeNode:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None
def MagicTree(tree, age):
    if age == 0:
        return 0 
    root = TreeNode(tree) 
    q = deque([root])
    actual_height = 0
    growth_buds_count = 0
    bfs_level = 0
    while q and actual_height<=age:
        count = 0
        for i in range (len(q)):
            current = q.popleft()
            current.left = TreeNode((str(root.value)+"L"+str(bfs_level+1)))
            current.right = TreeNode((str(root.value)+"R"+str(bfs_level+1)))
            q.append(current.left)
            q.append(current.right)
            count+=1
            print("current is : ", current.value, "level: ", bfs_level)
        growth_buds_count=count
        actual_height+=1
        bfs_level+=1
    return root,growth_buds_count

def tree_to_matrix(root,height):
    pass

if __name__ == "__main__":
    input = [2,[1,3]]
    Total_growthbuds = 0
    all_trees = []  # List to store all root nodes of trees

    for i in range(1,input[0]+1):
        root,count = MagicTree(i,input[1][i-1])
        all_trees.append([root,input[1][i-1]])  # Storing each root node
        Total_growthbuds+=count
    print("total growth buds: ",Total_growthbuds)

    for root in all_trees:
        # print(root[0].value,root[1])
        result = tree_to_matrix(root[0],root[1])
        # print_2d_array(result)
