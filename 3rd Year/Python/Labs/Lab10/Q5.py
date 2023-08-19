# Program to enter a number and then change the outcome to the words
Dict = {
        '0': 'zero', '1': 'one', '2': 'two', '3': 'three', '4': 'four',
        '5': 'five', '6': 'six', '7': 'seven', '8': 'eight', '9': 'nine'
       }

number = input("enter a number: ")

print(number)

for i in range(len(number)):
    if number[i] in Dict:
        print(Dict[number[i]], end=' ')
