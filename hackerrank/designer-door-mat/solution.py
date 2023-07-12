n=int(input())
m=int(input())
obstacle='.|.'
lignes=[]

for i in range(0,n-5):
    lignes.append(obstacle.center(m,'-'))
    obstacle='.|.'+obstacle+'.|.'

for i in range(0,len(lignes)-1):
    print(lignes[i])
print('WELCOME'.center(m, '-'))

for i in range(len(lignes)-2,-1,-1):
    print(lignes[i])








