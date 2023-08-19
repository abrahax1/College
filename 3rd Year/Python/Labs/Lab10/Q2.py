# Program to print a dictionary in different ways
Dict = {'a': 15, 'c': 35, 'b': 20}

# print all keys
for key in Dict:
    print(key, end=' ')

print('\n------------')

# print all values
for key, value in Dict.items():
    print(value, end=' ')

print('\n------------')

# print all keys and values
for key, value in Dict.items():
    print(key, value)

print('\n------------')

# print all keys and values in order of key
for key, value in sorted(Dict.items()):
    print(key, value)

print('\n------------')

# print all keys and values in order of value
for key, value in sorted(Dict.items()):
    print(key, value)

