from collections import Counter

s = input().strip()

# count the occurrences of each character
char_count = Counter(s)

# sort the dictionary based on occurrence count and character value
sorted_count = sorted(char_count.items(), key=lambda x: (-x[1], x[0]))

# print the top three most common characters and their occurrence count
for i in range(3):
    print(sorted_count[i][0], sorted_count[i][1])
