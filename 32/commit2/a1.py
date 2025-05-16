#!/usr/bin/env python3

# I didn't change anyting

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

        buds = []
        bud_x = 0

        for i in range(bud_count):
            print("O", end="")
            buds.append(bud_x)
            bud_x += 1
            if i != bud_count-1:
                print(" ", end="")
                bud_x += 1
        print("")


        while len(buds) > 1:
            new_buds = []
            bud_index = 0
            for x in range(width):
                if bud_index < len(buds) and x == buds[bud_index]:
                    if bud_index+1 < len(buds) and x == buds[bud_index+1]:
                        print("Y", end="")
                        new_buds.append(x)
                        bud_index += 2
                    elif bud_index % 2 == 0:
                        print("\\", end="")
                        new_buds.append(x+1)
                        bud_index += 1
                    else:
                        print("/", end="")
                        new_buds.append(x-1)
                        bud_index += 1
                else:
                    print(" ", end="")

            print("")
            buds = new_buds

        for _ in range(width//2):
            print(" ", end="")
        print("|", end="")

        print("")
        print("")


if __name__ == "__main__":
    main()