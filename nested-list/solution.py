if __name__ == '__main__':
    students = []
    for _ in range(int(input())):
        name = input()
        score = float(input())
        students.append([name, score])

    # Sort the list of students by score in ascending order
    students.sort(key=lambda x: x[1])

    # Find the second lowest score
    second_lowest_score = sorted(set([x[1] for x in students]))[1]

    # Filter the list of students to get those with the second lowest score
    second_lowest_students = [x[0] for x in students if x[1] == second_lowest_score]

    # Sort the list of second lowest students alphabetically and print their names
    for student in sorted(second_lowest_students):
        print(student)
