# ========================
#       Information
# ========================

# Name: Tuples in Python HackerRank
# Direct Link: https://www.hackerrank.com/challenges/python-tuples/problem
# Difficulty: Easy
# Max Score: 10
# Language: Pypy 3

# ========================
#         Solution Start
# ========================

# Tuples in Python - Hacker Rank Solution

if __name__ == '__main__':
    n = int(input())
    integer_list = map(int, input().split())
    # Tuples in Python - Hacker Rank Solution START
    t = tuple(integer_list)
    print(hash(t)) #it muste show me 3713081631934410656
    print(hash((2,1))) 
# Tuples in Python - Hacker Rank Solution END
# MyEduWaves