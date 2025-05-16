def prompt_user():
    trees = input()
    create_forest(trees)

def create_forest(trees):
    ages = [None] * trees
    for i in range(trees):
        age = input()
        ages[i] = age
    
    for a in ages:
        create_tree(a)

def create_tree(age):
    width = 2**age + (2**age - 1)

    for i in range(3):
        branches = 2**(age-1)
        padding = 2**(i) - 1

def print_top(width):
    top = ""
    for i in range(width):
        if i % 2 == 0:
            top += "-"
        else:
            top += "o"
    print(top)
# Given 2:
#o o  o o
# Y    Y
#    Y
# bottom is 2^2

# Given 3:
# o o o o o o o o
# o