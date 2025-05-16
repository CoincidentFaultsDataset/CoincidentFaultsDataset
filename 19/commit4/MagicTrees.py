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
    print_top(width)

    for i in range(age):
        # Began writing the \--/ part

        # At this point I realized I probably should have been using a matrix
        # :(

        # for j in range (int(2**(i-1) - 1)):
        #     if i > 0:
        #         space -= 2
        #         padding += 1
        #         middle = space + 2
        #         for i in range(padding):
        #             layer += "-"
        #         for i in range(branches):
        #             layer += "\\"
        #             for i in range(space):
        #                 layer += "-"
        #             layer += "/"
        #             for i in range(middle):
        #                 layer += "-"
        #         print(layer)
        layer = ""
        branches = 2**(age-(i+1))
        padding = 2**(i+1) - 1
        space = 2**(i+2) - 1
        # print("branches:", branches)
        # print("padding:", padding)
        # print("space:", space)
        for i in range(padding):
            layer += "-"
        for i in range(branches):
            layer += "Y"
            if branches == 1:
                break
            elif i < branches - 1:
                for i in range(space):
                    layer += "-"
        for i in range(padding):
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