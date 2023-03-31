n = int(input().strip())
students = []
for _ in range(n):
    name = input().strip()
    score = float(input().strip())
    students.append((name, score))

students = sorted(students, key=lambda x: (x[1], x[0]))


for i in range(1,len(students)):
    print(students[i][0])
    if(students[i][1] != students[i+1][1]):
        break
