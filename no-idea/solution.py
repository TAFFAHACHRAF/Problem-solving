# def intersection(lst1, lst2):
#     lst3 = [value for value in lst1 if value in lst2]
#     return lst3

n, m = map(int, input().split())
arr = list(map(int, input().split()))
A = list(map(int, input().split()))
B = list(map(int, input().split()))
Happy=0

for i in range(0,m):
    if(arr.__contains__(A[i])):
        Happy=Happy+1
    if(arr.__contains__(B[i])):
        Happy=Happy-1

print(Happy)
# print(len(intersection(arr, A)) - len(intersection(arr, B)))
