# Program to represent a rectangle
class Rectangle:
    def __init__(self, length=0, height=0, area=0, perimeter=0):
        self.length = length
        self.height = height
        self.area = area
        self.perimeter = perimeter

    def __str__(self):
        return 'length is {}, height is {}, area is {}, perimeter is {}'.format(self.length, self.height,
                                                                                self.area, self.perimeter)


rectangle = Rectangle(4, 2, 8, 12)
print(rectangle)
