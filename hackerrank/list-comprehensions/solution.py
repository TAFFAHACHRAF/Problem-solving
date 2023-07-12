def __equals(i,j,k,n):
    sum=i+j+k
    if(sum==n):
        return True
    return False

if __name__ == '__main__':
    x = int(input())
    y = int(input())
    z = int(input())
    n = int(input())
    Arr=[]
    _item:any

    for i in range(0,x+1):
        for j in range(0,y+1):
            for k in range(0,z+1):
                if(__equals(i,j,k,n)==False):
                    _item=[i,j,k]
                    Arr.append(_item)
    print(Arr)