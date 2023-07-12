#!/bin/python3

import math
import os
import random
import re
import sys

def _replace_symbols(str1,str2):
    return(str1.isalnum() and str2.isalnum())

first_multiple_input = input().rstrip().split()

n = int(first_multiple_input[0])

m = int(first_multiple_input[1])

matrix = []

for _ in range(n):
    matrix_item = input()
    matrix.append(matrix_item)


# decode the script
decoded = ""
for j in range(matrz):
    for i in range(rows):
        if matrix[i][j].isalnum():
            decoded += matrix[i][j]
        elif decoded and decoded[-1] != " ":
            decoded += " "

print(decoded)



