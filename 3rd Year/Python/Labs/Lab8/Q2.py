# Program to order data in reverse order
Sample_data = [('item1', 12.20), ('item2', 15.10), ('item3', 24.5)]

# key is for what we want to order our data by
# lambda lets us create our own key
# reverse changes the order in which it is ordering (high to low, low to high)
print(sorted(Sample_data, key=lambda float: float[1], reverse=True))
