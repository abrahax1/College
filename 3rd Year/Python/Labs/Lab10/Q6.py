# Program to enter countries and their capitals and then sort the capitals
Countries = {}
Capitals = []

print('Enter "E" to stop entering countries ')

while True:
    Country = input('Enter a Country: ')
    if Country == 'E' or Country == 'e':
        break

    else:
        Capital = input('Enter its Capital: ')

        Countries[Country] = Capital
        # List passing to List
        Capitals += [Capital]      # You can use this method as well ( Capitals.append(Capital) )

print('Dictionary:', Countries)

print('Sorted Capitals', sorted(Capitals))
