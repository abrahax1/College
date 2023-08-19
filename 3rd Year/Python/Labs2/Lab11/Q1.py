# Program to input a list of integers and remove even or odd numbers
integer_list = []


# function to remove even numbers
def remove_evens(int_list):
    while True:
        integers = input('Enter an integer list or "e" to exit: ')
        if integers == 'e' or integers == 'E':
            break

        else:
            int_list += [integers]

    print('Original list:', integer_list)

    i = 0
    to_remove = []

    for n in int_list:
        int_list[i] = int(n)
        i += 1

    i = 1
    for n in int_list:
        if n % 2 == 0:
            to_remove += [n]
            i += 1

        else:
            i += 1

    for n in to_remove:
        int_list.remove(n)


# function to remove odd numbers
def remove_odds(int_list):
    int_list.clear()

    while True:
        integers = input('Enter an integer list or "e" to exit: ')
        if integers == 'e' or integers == 'E':
            break

        else:
            int_list += [integers]

    print('Original list:', integer_list)

    i = 0
    to_remove = []

    for n in int_list:
        int_list[i] = int(n)
        i += 1

    i = 1
    for n in int_list:
        if n % 2 == 0:
            i += 1

        else:
            to_remove += [n]
            i += 1

    for n in to_remove:
        int_list.remove(n)


# function to remove even or odd numbers by user choice
def remove_choice(int_list):
    int_list.clear()

    while True:
        integers = input('Enter an integer list or "e" to exit: ')
        if integers == 'e' or integers == 'E':
            break

        else:
            int_list += [integers]

    choice = input("(T)rue for odd or (F)alse for even: ")

    print('Original list:', integer_list)

    i = 0
    to_remove = []

    for n in int_list:
        int_list[i] = int(n)
        i += 1

    i = 1

    if choice == 'True' or choice == 'T':
        for n in int_list:
            if n % 2 == 0:
                i += 1

            else:
                to_remove += [n]
                i += 1

        for n in to_remove:
            int_list.remove(n)

        print('Odd', end='')

    elif choice == 'False' or choice == 'F':
        for n in int_list:
            if n % 2 == 0:
                to_remove += [n]
                i += 1

            else:
                i += 1

        for n in to_remove:
            int_list.remove(n)

        print('Even', end='')

    else:
        print('Enter either "False", "True" or "T" , "F" ')
        exit(0)


# remove_evens(integer_list)
# print('Even numbers removed:', integer_list)

# remove_odds(integer_list)
# print('Odd numbers removed:', integer_list)
#
remove_choice(integer_list)
print(' numbers removed:', integer_list)
