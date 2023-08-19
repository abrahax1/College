# Program that ask user if they want to use a specific type to input
choice = input("Do you want to use prompt(P) or type(T): ")


def safe_input():
    inputted = ''

    while True:
        if choice == 'P' or choice == 'p':
            prompt = input("Enter only string: ")
            try:
                prompt = str(prompt)

            except ValueError:
                input("Enter STRING only")

            else:
                inputted = prompt
                break

        elif choice == 'T' or choice == 't':
            choice2 = input("Do you want to enter int(I), float(F) or string(S): ")
            if choice2 == 'I' or choice2 == 'i':
                multiple = input("Enter an integer: ")

                while True:
                    try:
                        multiple = int(multiple)

                    except ValueError:
                        multiple = input("Enter INTEGER only: ")

                    else:
                        inputted = multiple
                        break

                break

            elif choice2 == 'F' or choice2 == 'f':
                multiple = input("Enter a Float: ")
                while True:
                    try:
                        multiple = float(multiple)

                    except ValueError:
                        multiple = input("Enter FLOAT only: ")

                    else:
                        inputted = multiple
                        break
                break

            elif choice2 == 'S' or choice2 == 's':
                multiple = input("Enter a String: ")

                while True:
                    try:
                        multiple = str(multiple)

                    except ValueError:
                        multiple = input("Enter STRING only: ")

                    else:
                        inputted = multiple
                        break
                break

        else:
            print("Please enter 'P' or 'T'")
            break

    print(inputted)


safe_input()
