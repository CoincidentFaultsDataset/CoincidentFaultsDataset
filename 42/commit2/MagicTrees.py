def no_of_buds(age):
    return 2**age # figured out that total no of buds per tree is 2 power age of the tree



n = int(input())
if n < 0 or n > 20:
    print("Invalid number of trees")
    exit()  

ages = []
for i in range(n):
    age = int(input(f"Enter the age of tree {i + 1}: "))#will remove these print statements later..!!

    if age < 0 or age > 6:  
        print(f"Invalid age for tree {i + 1}")
        exit()
    ages.append(age)

print("Number of trees:", n)
print("Ages of trees:", ages)

total_buds = 0
for age in ages:
    total_buds += no_of_buds(age)
print(f"total no of buds is : {total_buds}")

for i, age in enumerate(ages):
    buds = no_of_buds(age) 
    top_line = "O" + "-O" * (buds - 1)  # Construct the top line
    print(top_line)