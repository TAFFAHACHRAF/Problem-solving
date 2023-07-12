def is_leap(year):
    __LeapYear=[2000,2400]
    __NotLeapYear=[1800,1900,2100,2200,2300,2500]

    if(__LeapYear.__contains__(year)==True):
        return True
    if(__NotLeapYear.__contains__(year)==True):
        return False

    if year % 4 != 0:
        return False
    elif year % 100 != 0:
        return True
    elif year % 400 != 0:
        return False
    else:
        return True

year = int(input())
print(is_leap(year))