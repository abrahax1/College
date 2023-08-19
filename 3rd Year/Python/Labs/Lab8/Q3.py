# Commented lines do not work
Square_number_list = [Number ** 2 for Number in (range(1, 10))]

# Colours = ['Red', 'Blue', 'Green', 'Black', 'White']
# Colours = [C for C in (range(len(Colours))) if C.isupper()]

Divisible_by_7 = [N for N in range(1, 1001) if N % 7 == 0]

# Number_contains_3 = [N2 for N2 in range(1, 1000) if 3 in N2]

# Spaces_in_string = [S.count(' ') for S in 'Hello World, Nice Day' if ' ' in S]

vowels = str(['a', 'e', 'i', 'o', 'u'])
Remove_vowels = [V for V in 'Hello World, Nice day' if V not in vowels]

# Shorter_than_4_letters = [W for W in 'Hi, have a good day my friend' if W < 4]

print("Square list:", Square_number_list)
# print(Colours)
print("Divisible by 7:", Divisible_by_7)
# print("Number with 3:", Number_contains_3)
# print('Spaces in word', Spaces_in_string)
print('Vowel remover:', Remove_vowels)
# print('4 letter words:', Shorter_than_4_letters)
