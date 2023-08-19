# Program to represent a vehicle in a class with different subclasses such as car, truck

# Definition of vehicle class
class Vehicle(object):
    def __init__(self, year=2020, mileage=0, vin=12345, engine=1.6, transmission='Manual', model='Audi',
                 vehicle_type='Vehicle'):
        self.year = year
        self.mileage = mileage
        self.vin = vin
        self.engine = engine
        self.transmission = transmission
        self.model = model
        self.vehicle_type = vehicle_type

    # Definition of printing method
    def __str__(self):
        # Checks from what subclass is being called and changes vehicle type accordingly
        if Call == 1:
            self.vehicle_type = 'Car'
        elif Call == 2:
            self.vehicle_type = 'Truck'
        elif Call == 3:
            self.vehicle_type = 'SUV'
        elif Call == 4:
            self.vehicle_type = 'MiniVan'

        return ("{} year: {}, {} mileage: {} Km, {} VIN: {}, {} engine: {}, {} transmission: "
                "{}, {} model: {}".format(self.vehicle_type, self.year, self.vehicle_type, self.mileage,
                                          self.vehicle_type, self.vin, self.vehicle_type, self.engine,
                                          self.vehicle_type, self.transmission, self.vehicle_type, self.model))


# Car Sub Class, No changes to Vehicle class
class Car(Vehicle):
    def __str__(self):
        global Call
        Call = 1

        return_str = Vehicle.__str__(self)
        return return_str


# Truck Sub Class, towing capacity, wheels and rest room added
class Truck(Vehicle):
    def __init__(self, towing_capacity=2000, wheels=8, rest_room='Yes', year=2020, mileage=0, vin=12345, engine=1.6,
                 transmission='Manual', model='Audi'):
        super().__init__(year, mileage, vin, engine, transmission, model)
        self.towing_capacity = towing_capacity
        self.wheels = wheels
        self.rest_room = rest_room

    # appended new additions
    def __str__(self):
        global Call
        Call = 2

        return_str = Vehicle.__str__(self)
        return_str += ', Truck towing capacity: {} Kg, Truck wheels: {}, Truck rest room: {}'\
            .format(self.towing_capacity, self.wheels, self.rest_room)

        return return_str


# SUV Sub Class, 4x4 added
class SUV(Vehicle):
    def __init__(self, four_x_four='Yes', year=2020, mileage=0, vin=12345, engine=1.6,
                 transmission='Manual', model='Audi'):
        super().__init__(year, mileage, vin, engine, transmission, model)

        self.four_x_four = four_x_four

    # appended new addition
    def __str__(self):
        global Call
        Call = 3

        return_str = Vehicle.__str__(self)
        return_str += ', SUV four_x_four: {}'.format(self.four_x_four)

        return return_str


# Minivan Sub Class, storage, max load added
class Minivan(Vehicle):
    def __init__(self, storage='Yes', max_load=2000, year=2020, mileage=0, vin=12345, engine=1.6,
                 transmission='Manual', model='Audi'):
        super().__init__(year, mileage, vin, engine, transmission, model)

        self.storage = storage
        self.max_load = max_load

    # appended new additions
    def __str__(self):
        global Call
        Call = 4

        return_str = Vehicle.__str__(self)
        return_str += ', Minivan storage: {}, Minivan max load: {} Kg'.format(self.storage, self.max_load)

        return return_str


# Main Function
Call = 0

Car1 = Car(2010, 100000, 23456, 2.0, 'Automatic', 'Ferrari')
Truck1 = Truck(2000, 16, 'Yes', 2012, 150000, 56832, 4.0, 'Manual', 'Mercedes Benz')
SUV1 = SUV('Yes', 2015, 300000, 54362, 2.0, 'Manual', 'Ford')
Minivan1 = Minivan('Yes', 5000, 2019, 20000, 234145, 3.2, 'Manual', 'Ford')

print(Car1)
print(Truck1)
print(SUV1)
print(Minivan1)
