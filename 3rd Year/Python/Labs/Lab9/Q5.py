# Program to find file then print lines from the file
# Last part not working
file_str = input("Open what file:")

while True:
    try:
        input_file = open(file_str)
        # potential user error
    except IOError:
        print("The file", file_str, "doesn't exist.")
        file_str = input("Enter file name again: ")

    else:
        break

find_line_str = input("Which line (integer):")

while True:
    try:
        find_line_int = int(find_line_str)
        # potential user error
        line_count_int = 1
        for line_str in input_file:
            if line_count_int == find_line_int:
                print("Line {} of file {} is {}".format(find_line_int, file_str, line_str))
                break
            line_count_int += 1

        else:
            # get here if line sought doesn't exist
            print("Line {} of file {} not found".format(find_line_int, file_str))

        input_file.close()

    except ValueError:
        print("Line", find_line_str, "isn't a legal line number.")

    else:
        input_file.close()
        break

print("End of the program")
