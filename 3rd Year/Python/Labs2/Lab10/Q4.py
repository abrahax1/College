# Program to combine two dictionaries and adding the common keys
d1 = {'a': 100, 'b': 200, 'c': 300}
d2 = {'a': 300, 'b': 200, 'd': 400}
d3 = {}

for key, value in d1.items():
    for key2, value2 in d2.items():
        if key2 == key:
            d3[key] = value + value2
        else:
            d3[key] = value
            d3[chr(ord(key) + 1)] = value2

print(d3)
