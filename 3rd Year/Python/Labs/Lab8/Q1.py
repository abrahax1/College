# Program to add and multiply tuples
Num1, Num2 = map(int, input("Enter two numbers: ").split())
Tuple = (Num1, Num2)


def add_tuples(new_tuple):
    print(sum(new_tuple))


def multiply_tuples(new_tuple):
    total = new_tuple[0] * new_tuple[1]
    print(total)


add_tuples(Tuple)
multiply_tuples(Tuple)
