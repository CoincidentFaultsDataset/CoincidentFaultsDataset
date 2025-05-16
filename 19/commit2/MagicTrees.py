def prompt_user():
    trees = int(input())
    create_forest(trees)

def create_forest(trees):
    ages = []
    for i in range(trees):
        age = int(input())
        ages.append(age)
    
    for a in ages:
        create_tree(a)

def create_tree(age):
    width = 2**age + (2**age - 1)

    for i in range(age):
        layer = ""
        branches = 2**(age-(i+1))
        padding = 2**(i+1) - 1
        space = 2**(i+2) - 1
        print("branches:", branches)
        print("padding:", padding)
        print("space:", space)
        if branches > 1:
            for i in range(padding):
                layer += "-"
        else:
            for i in range() 
        for i in range(branches):
            layer += "Y"
            for i in range(space):
                layer += "-"
        layer += "-"
        print(layer)

        

def print_top(width):
    top = ""
    for i in range(width):
        if i % 2 == 0:
            top += "-"
        else:
            top += "o"
    print(top)

prompt_user()
# Given 2:
#o o  o o
# Y    Y
#    Y
# bottom is 2^2

# Given 3:
# o o o o o o o o
# o