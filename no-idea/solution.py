def intersection(lst1, lst2):
    lst3 = [value for value in lst1 if value in lst2]
    return lst3

n, m = map(int, input().split())
arr = list(map(int, input().split()))
A = list(map(int, input().split()))
B = list(map(int, input().split()))

happiness = len(intersection(arr, A)) - len(intersection(arr, B))

print(happiness)
