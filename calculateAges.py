def calculateInDHM(age):
    ageInDays = age/365
    age %= 365
    ageInMinutes = age/525949.2
    age %= 525949.2
    print("Your age is: %s . %s" % (ageInDays, ageInMinutes))


