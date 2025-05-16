#!/usr/bin/env python3
#
# [IDENTIFYING INFORMATION REMOVED]
#


def main():
    tree_count = int(input())
    tree_ages = []

    for _ in range(tree_count):
        tree_ages.append(int(input()))

    bud_sum = 0

    for age in tree_ages:
        bud_sum += pow(2, age)

    print("")
    print(bud_sum)

    for age in tree_ages:
        bud_count = pow(2, age)
        width = bud_count*2-1

        branches = []
        branch_x = 0

        for i in range(bud_count):
            print("O", end="")
            branches.append(branch_x)
            branch_x += 1
            if i != bud_count-1:
                print(" ", end="")
                branch_x += 1
        print("")


        while len(branches) > 1:
            new_branches = []
            branch_index = 0
            for x in range(width):
                if branch_index < len(branches) and x == branches[branch_index]:
                    if branch_index+1 < len(branches) and x == branches[branch_index+1]:
                        print("Y", end="")
                        new_branches.append(x)
                        branch_index += 2
                    elif branch_index % 2 == 0:
                        print("\\", end="")
                        new_branches.append(x+1)
                        branch_index += 1
                    else:
                        print("/", end="")
                        new_branches.append(x-1)
                        branch_index += 1
                else:
                    print(" ", end="")

            print("")
            branches = new_branches

        for _ in range(width//2):
            print(" ", end="")
        print("|", end="")

        print("")
        print("")


if __name__ == "__main__":
    main()