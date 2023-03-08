def is_leap(year):
    return True if ((year %4 == 0) and not(year%100 == 0) and year%400 == 0) else False 
    # This function return True if the year is a leap year

year = int(input())
print(is_leap(year))