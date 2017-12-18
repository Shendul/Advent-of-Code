# Initialize a tree.
tree = {}

# Open file and split on new lines.
with open('instructions.txt', 'r') as file:
    instructions = file.readlines()

    for instruction in instructions:
        words = instruction.split("\n")
        # Split on -> if it's there.
        parent_children = words[0].split(" -> ")
        name_weight = parent_children[0].split(' ')
        name = name_weight[0]
        weight = name_weight[1][1:-1]
        # Initialize nodes with who their parent is.
        if name not in tree:
            tree[name] = {"parent":"", "weight":0,  "childlist":[]}
        tree[name]["weight"] = weight
        if parent_children.__len__() > 1:
            child = parent_children[1].split(", ")
            for c in child:
                if c not in tree:
                    tree[c] = {"parent":"", "weight":0,  "childlist":[]}
                # if it is in tree change it's parent and childlist of that parent
                tree[c]["parent"] = name
                tree[name]["childlist"].append(c)


    # Part one
    root = ""

    for key, value in tree.items():
        if value["parent"] == "":
            root = key
            print("Root of the tree = " + root)
            break


    # Part two
    
    

                
                

    
