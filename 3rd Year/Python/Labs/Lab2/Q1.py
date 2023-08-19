# ask for grade if grade is equal or lower than 39 fail, higher than 39 pass
while True:

    Grade = int(input("Enter your grade: "))

    # Error checking
    if Grade < 0 or Grade > 100:
        print("please enter a valid Grade from 0 to 100")
        continue

    elif Grade <= 39:
        print("You have failed the class")
        break

    else:
        print("You have passed the class")
        break
