# 2 loops to print a triangle of stars
Triangle_N = range(5)
count = 0
Stars = "*"

# repetitions of triangle formation
for i in range(1):
    print("")

    # repetition of stars in one line
    for j in Triangle_N:
        count += 1
        print(Stars * count)
