def no_of_buds(age):
    return 2**age # figured out that total no of buds per tree is 2 power age of the tree


def main():
    n = int(input())
    if n < 0 or n > 20:
        print("Invalid number of trees")
        exit()  

    ages = []
    for i in range(n):
        age = int(input())#will remove these print statements later..!!

        if age < 0 or age > 6:  
            print(f"Invalid age for tree {i + 1}")
            exit()
        ages.append(age)

    # print("Number of trees:", n)
    # print("Ages of trees:", ages)

    total_buds = 0
    for age in ages:
        total_buds += no_of_buds(age)
    print(total_buds)

    for i, age in enumerate(ages):
        buds = no_of_buds(age) 
        top_line = "O" + " O" * (buds - 1)  # Construct the top line
        print(top_line)
        if buds > 1:
            second_line = " Y" + "   Y" * (buds // 2 - 1) + " "
            print(second_line)

        spaces=0
        if age > 1:
            spaces = 2
            for level in range(1, age):
                num_branches = buds // (2 ** (level + 1))

                # Branch connections
                branch_line = " " * spaces + "  \\ /"
                branch_line += "     \\ /" * (num_branches - 1)
                print(branch_line)

                
                y_line = " " * spaces + "   Y   "
                y_line += "       Y" * (num_branches - 1)
                print(y_line)

                spaces += 2
        print(" " * spaces + "|")
        print()

if __name__=="__main__":
    main()