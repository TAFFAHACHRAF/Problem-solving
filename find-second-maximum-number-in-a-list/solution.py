from array import *
if __name__ == '__main__':
    n=int(input())
    Arr=[]
    for i in range(0,n):
        Arr.append(int(input().split()[0]))
    Arr.sort()
    print(Arr[-2])
