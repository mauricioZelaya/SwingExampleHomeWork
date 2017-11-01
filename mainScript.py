from agesMessages import messageForAge
from calculateAges import calculateInDHM

numberOfUsers = int(input("please set a number of users: "))
usersDictionary = {}

for val in range(numberOfUsers):
    name = input("name: ")
    age = int(input("age: "))
    usersDictionary[name] = {age}
print(usersDictionary)

# print(usersDictionary[1])
for dictKey in usersDictionary:
    messageForAge(int(usersDictionary[dictKey]))


