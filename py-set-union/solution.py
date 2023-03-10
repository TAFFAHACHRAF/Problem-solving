# Enter your code here. Read input from STDIN. Print output to STDOUT

n1 = int(input())
set1 = set(map(int, input().split()))
n2 = int(input())
set2 = set(map(int, input().split()))

# Union of both sets
union_set = set1.union(set2)

# Counting the number of students who have at least one subscription
print(len(union_set))

