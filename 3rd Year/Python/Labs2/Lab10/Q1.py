# Program to print the value inside a key and find the key of a value
D = {'a': 3, 'x': 7, 'r': 5}

print(D['x'])

for key, value in D.items():
    if value == 7:
        print(key)
