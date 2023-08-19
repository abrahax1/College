# Program to represent a gym's inheritance
class Gym(object):
    def __init__(self, member=10, equipment='Weights', subscription=12, payed='No'):
        self.members = member
        self.equipment = equipment
        self.subscription = subscription
        self.payed = payed


class Person(Gym):
    def __init__(self, f_name, s_name, member=10, equipment='weights', subscription=12, payed="No"):
        super().__init__(member=member, equipment=equipment, subscription=subscription, payed=payed)
        self.f_name = f_name
        self.s_name = s_name

    def __str__(self):
        return 'First name: {}, Surname: {}, Member No: {}, Equipment: {}, Subscription: €{}, Payed: {}'\
                .format(self.f_name, self.s_name, self.members, self.equipment, self.subscription, self.payed)


Person1 = Person('Abraham', 'Izarra', equipment='Weights', payed='Yes')
Person2 = Person('David', 'Duque', 11, 'Walking machine', 14, 'Yes')
Person3 = Person('John', 'Salchichon', 12, 'Weights + Walking machine + Pool', 32, 'No')

print('P1-', Person1)
print('P2-', Person2)
print('P3-', Person3)
