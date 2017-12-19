# Initialize dictionary of variable names and values.
variables = {}

# Open file and split lines on spaces.
with open('day8instructions.txt', 'r') as file:
    lines = file.readlines()
    for line in lines:
        instruction = line.split(" ")
        # Check to see if the variable intending to be modified exists, if not
        # create it and initilize to 0.
        if instruction[0] not in variables:
            variables[instruction[0]] = 0
        # Grab value of the above variable
        # Check to see if the variable in the if statment exists, if not, init.
        if instruction[4] not in variables:
            variables[instruction[4]] = 0
            
        if instruction[5] == '>':
            var = variables[instruction[4]]
            number = instruction[6].rsplit() # remove new line
            if var > int(number[0]): # make comparison
                if instruction[1] == 'inc':
                    inc = instruction[2]
                    variables[instruction[0]] += int(inc)
                    #print(variables)
                else:
                    dec = instruction[2]
                    variables[instruction[0]] -= int(dec)
                    #print(variables)
        elif instruction[5] == '<':
            var = variables[instruction[4]]
            number = instruction[6].rsplit() # remove new line
            if var < int(number[0]): # make comparison
                if instruction[1] == 'inc':
                    inc = instruction[2]
                    variables[instruction[0]] += int(inc)
                    #print(variables)
                else:
                    dec = instruction[2]
                    variables[instruction[0]] -= int(dec)
                    #print(variables)
        elif instruction[5] == '>=':
            var = variables[instruction[4]]
            number = instruction[6].rsplit() # remove new line
            if var >= int(number[0]): # make comparison
                if instruction[1] == 'inc':
                    inc = instruction[2]
                    variables[instruction[0]] += int(inc)
                    #print(variables)
                else:
                    dec = instruction[2]
                    variables[instruction[0]] -= int(dec)
                    #print(variables)
        elif instruction[5] == '<=':
            var = variables[instruction[4]]
            number = instruction[6].rsplit() # remove new line
            if var <= int(number[0]): # make comparison
                if instruction[1] == 'inc':
                    inc = instruction[2]
                    variables[instruction[0]] += int(inc)
                    #print(variables)
                else:
                    dec = instruction[2]
                    variables[instruction[0]] -= int(dec)
                    #print(variables)
        elif instruction[5] == '==':
            var = variables[instruction[4]]
            number = instruction[6].rsplit() # remove new line
            if var == int(number[0]): # make comparison
                if instruction[1] == 'inc':
                    inc = instruction[2]
                    variables[instruction[0]] += int(inc)
                    #print(variables)
                else:
                    dec = instruction[2]
                    variables[instruction[0]] -= int(dec)
                    #print(variables)
        elif instruction[5] == '!=':
            var = variables[instruction[4]]
            number = instruction[6].rsplit() # remove new line
            if var != int(number[0]): # make comparison
                if instruction[1] == 'inc':
                    inc = instruction[2]
                    variables[instruction[0]] += int(inc)
                    #print(variables)
                else:
                    dec = instruction[2]
                    variables[instruction[0]] -= int(dec)
                    #print(variables)

    maxNum = max(variables.values())
    print(maxNum)
            
            
