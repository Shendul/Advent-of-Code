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
        weight = int(name_weight[1][1:-1])
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
    def calcWeight(node):
        totalWeight = tree[node]["weight"]
        for child in  tree[node]["childlist"]:
            totalWeight += calcWeight(child)
        return totalWeight


    def calcNewWeight(node):
        #set up array of weights to compare
        weights = []
        parents = []

        for child in tree[node]["childlist"]:
            print(child + " " + str(tree[child]["weight"]))
            weights.append(calcWeight(child))
            parents.append(child)

        for w in range(len(weights)):
            if weights[w] > weights[(w+1)%len(weights)]:
                print(weights)

                calcNewWeight(parents[w])
                
                unbalance = weights[w] - weights[(w+1)%len(weights)]
                print(unbalance)
                oldWeight = tree[parents[w]]["weight"]
                newWeight = oldWeight - unbalance
                print("newWeight = " + str(newWeight))
                # first weight printed is the correct newWeight


    
    calcNewWeight(root)
    

                
                

    

