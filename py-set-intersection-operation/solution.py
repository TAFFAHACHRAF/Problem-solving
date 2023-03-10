# Enter your code here. Read input from STDIN. Print output to STDOUT

def intersection(lst1, lst2):
    lst3 = [value for value in lst1 if value in lst2]
    return lst3

n1 = int(input())
set1 = set(map(int, input().split()))
n2 = int(input())
set2 = set(map(int, input().split()))

# Union of both sets
untersection_set = intersection(set1,set2)

# Counting the number of students who have at least one subscription
print(len(untersection_set or []))