def checkSubSet():
    N = int(input().split())
    for i in range(N):
        nbElementsOfSetA = int(input())
        A = set(input().split())

        nbElementsOfSetB = int(input())
        B = set(input().split())

        if A.issubset(B):
            print(True)
        else:
            print(False)

checkSubSet()
