# Program to find a file
File_name = input("Enter a file name to look for: ")


def prompt_open(filename):
    while True:
        try:
            input_file = open(filename)

        except IOError:
            filename = input("enter an existing file name: ")

        else:
            for line_str in input_file:
                print("{}".format(line_str))

            input_file.close()

            break


prompt_open(File_name)
