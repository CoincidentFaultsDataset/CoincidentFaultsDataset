def grow_forrest(ages):
    total_growth_buds = calc_growth_buds(ages)
    print_tree(total_growth_buds)

def print_tree(growth_buds, ):
    print(growth_buds)

def calc_growth_buds(ages):
    growth_buds = 0
    for age in ages:
        growth_buds += 2 ** age
    return growth_buds

def main():
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
