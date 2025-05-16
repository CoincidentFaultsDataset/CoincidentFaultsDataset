def grow_forrest(ages):
    total_growth_buds = calc_growth_buds(ages)
    print_tree(total_growth_buds)

def build_tree(age):
    if age == 0:
        return [['O'], ['|']]
    tree = []
    treesize = 0
    baserow = list("-" * ((2 ** age) + (2 ** age) - 1))
    for i in range(len(baserow)):
        if i % 2 == 0:
            baserow[i] = "O"
    tree.append(baserow)
    treesize += 1
    while treesize < age ** 2:
        for i in range(1, len(baserow):
            if tree[treesize - 1][0]:
                       print("TODO")

    endrow = list("-" * len(baserow))
    endrow[len(endrow) // 2] = "|"
    tree.append(endrow)
    return tree

def print_tree(tree):
    for line in tree:
        print(line)

def calc_growth_buds(ages):
    growth_buds = 0
    for age in ages:
        growth_buds += 2 ** age
    return growth_buds

def main():
    print(build_tree(1))
    num_trees = int(input("number of trees: "))

    if num_trees < 0 or num_trees >= 20:
        print("invalid number of trees, must be >= 1 and < 20")
        exit(1)
    tree_ages = []

    for i in range(num_trees):
        tree_age = int(input("Age of tree " + str(i) + ": "))

        if tree_age < 0 or tree_age >= 7:
            print("invalid tree age, must be >= 0 and < 7")
            exit(1)
        tree_ages.append(tree_age)

if __name__ == "__main__":
    main()
