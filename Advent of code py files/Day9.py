# Initilize score and some counters/trackers
score = 0
openBrackets = 0
garbage = False
cancelNext = False

# Open file.
with open('day9input.txt', 'r') as file:
    file_input = file.read()
    print(file_input)
    for char in file_input:
        #print (char)
        if cancelNext:
            #print ("cancel")
            cancelNext = False
        else:
            if garbage:
                #print ("garbage")
                if char == '!':
                    cancelNext = True
                elif char == '>':
                    #print ("close garbage")
                    garbage = False
            else:
                if char == '{':
                    openBrackets += 1
                elif char == '<':
                    garbage = True
                elif char == '}':
                    score += openBrackets # maybe right
                    openBrackets -= 1
    print(score)


