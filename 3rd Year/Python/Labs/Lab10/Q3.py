# Program to generate a dictionary
Dict = {}
j = 'a'

for i in range(1, 11):
    Dict[j] = i * i
    j = chr(ord(j) + 1)     # Converts to ascii adds 1 > converts to char

print(Dict)
