def is_leap(year):
    __LeapYear=[2000,2400]
    __NotLeapYear=[1800,1900,2100,2200,2300,2500]

    if(__LeapYear.__contains__(year)==True):
        return True
    if(__NotLeapYear.__contains__(year)==True):
        return False

    is_devided_by_4=year%4==0
    is_not_devided_by_100=not(year%100==0)
    is_devided_by_400=year%400==0

    return True if is_devided_by_4 and is_not_devided_by_100 and is_devided_by_400 else False
    # This function return True if the year is a leap year

year = int(input())
print(is_leap(year))