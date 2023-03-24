#!/bin/python3

import math
import os
import random
import re
import sys

first_multiple_input = input().rstrip().split()

n = int(first_multiple_input[0])

m = int(first_multiple_input[1])

matrix = []

for _ in range(n):
    matrix_item = input()
    matrix.append(matrix_item)

result = ""

for j in range(0,3):
    for i in range(0,len(matrix)):
        result = result + matrix[i][j]

print(result)
