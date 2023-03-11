#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the solve function below.
def solve(s:str):
    array_str=s.split(" ")
    result=array_str[0].capitalize()+" "
    for i in range(1,len(array_str)):
        result=result+array_str[i].capitalize()+" "
    return result
    

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    result = solve(s)

    fptr.write(result + '\n')

    fptr.close()
